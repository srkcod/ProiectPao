package services;


import models.Client;

import repositories.ClientRepo;

import java.io.IOException;
import java.util.Set;

public final class ClientService {

    private static ClientService instance;
    private final ClientRepo clientRepo;

    private ClientService() throws IOException {
        clientRepo = new ClientRepo();
    }

    public static ClientService getInstance() throws IOException {
        if (instance == null)
            instance = new ClientService();
        return instance;
    }

    public Set<Client> getClients() {
        return clientRepo.getClients();
    }

}