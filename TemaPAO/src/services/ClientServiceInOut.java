package services;

import models.Client;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class ClientServiceInOut {
    private static final String PATH = "src/data/Client.csv";
    private static final String HEADER = "cnp,nume";
    private  static ClientServiceInOut instance;
    private ClientServiceInOut ClientService;

    private ClientServiceInOut(){}

    public static ClientServiceInOut getInstance(){
        if(instance == null)
            instance = new ClientServiceInOut();
        return instance;
    }

    public final Set<Client> loadClienti() throws IOException {
        final Set<Client> clienti = new HashSet<>();
        BufferedReader reader = new BufferedReader(new FileReader(PATH));

        String line;
        reader.readLine();
        while((line = reader.readLine()) != null){
            final String[] fields = line.split("\\s*,");
            if(fields.length > 0){
                if("null".equals(fields[3]))
                    clienti.add(new Client(123,fields[2],true));
               
            }
        }

        reader.close();
        return clienti;
    }

    public void saveClients() throws IOException {
        FileWriter writer = new FileWriter(PATH);
        writer.write(HEADER + "\n");
        final Set<Client> clienti = ClientService.getInstance().getClients();
        for(final Client client:clienti){

            writer.append(String.valueOf(client.getCnp())).append(",");
            writer.append(String.valueOf(client.getNume())).append(",");
            
        }
        writer.flush();
        writer.close();
    }


}
