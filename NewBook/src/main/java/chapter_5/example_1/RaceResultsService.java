package chapter_5.example_1;

import java.util.*;

public class RaceResultsService
    {
        private Map<Client,Category> subscribers = new HashMap<Client,Category>();

    public void addSubscriber(Client client,Category category) {
        subscribers.put(client,category);
    }

    public void sendMessageByCategory(Message message, Category category) {
        subscribers.forEach((client, s) -> {
            if(s.equals(category)){
                client.receive(message);
            }
        });
    }

    public void removeSubscriber(Client clientA) {
        subscribers.remove(clientA);
    }


}
