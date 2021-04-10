package chapter_5.example_1;

import java.time.LocalDate;
import java.util.*;

public class RaceResultsService
    {
    Logger logger;
        private Map<Client,Category> subscribers = new HashMap<Client,Category>();

        public RaceResultsService(Logger logger) {
            this.logger = logger;
        }

        public void addSubscriber(Client client, Category category) {
        subscribers.put(client,category);
    }

    public void sendMessageByCategory(Message message, Category category) {
        subscribers.forEach((client, s) -> {
            if(s.equals(category)){
                logger.log(LocalDate.now(),message.getMessage());
                client.receive(message);
            }
        });
    }

    public void removeSubscriber(Client clientA, Category category) {
            if (!subscribers.get(clientA).equals(category)){
                throw new IllegalArgumentException("Such subscription doesn't exists");
            }
            else{
                subscribers.remove(clientA);
            }
    }


}
