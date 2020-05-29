package repositories;

import models.Client;
import services.ClientServiceInOut;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ClientRepo {

    private final Set<Client> clients;
    private final ClientServiceInOut ClientServiceInOut = null;

    public ClientRepo() throws IOException {
        clients = ClientServiceInOut.getInstance().getClients();
    }

    public Set<Client> getClienti() {
        return Collections.unmodifiableSet(clients);
    }

    public boolean add(final Client client) {
        return clients.add(client);
    }

    public boolean remove(final int cnp) {
        final Client client = getClientByCnp(cnp);
        if (client == null)
            return false;
        return clients.remove(client);
    }

    public Client getClientByCnp(int cnp) {
        for (final Client client : clients) {
            if (client.getCnp() == cnp)
                return client;
        }
        return null;
    }

    public Set<Client> getClientsByNume(String nume) {
        Set<Client> srcResult = null;
        for (final Client client : clients) {
            if (client.getNume().equals(nume)) {
                if (srcResult == null)
                    srcResult = new HashSet<>();
                srcResult.add(client);
            }
        }
        return srcResult;
    }

    

    
}