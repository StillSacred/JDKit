import java.util.Collection;

public class ClientDatabase implements Repository<Client> {
    private Collection<Client> clients;

    @Override
    public void add(Client client) {
        clients.add(client);
    }

    @Override
    public void update(Client oldClient, Client newClient) {
        oldClient.setFirstName(newClient.getFirstName());
        oldClient.setLastName(newClient.getLastName());
    }

    @Override
    public void delete(Client client) {
        clients.remove(client);
    }

    @Override
    public Client getById(int id) {
        for (Client client : clients) {
            if (client.getId() == id) {
                return client;
            }
        }
        return null;
    }
}