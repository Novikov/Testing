package chapter_5.example_1;
import org.junit.Test;

import static org.mockito.Mockito.*;


public class RaceResultsServiceTest {


   private RaceResultsService raceResults = new RaceResultsService();
   private Message message = mock(Message.class);
   private Client clientA = mock(Client.class, "clientA");
   private Client clientB = mock(Client.class, "clientB");

    @Test
    public void notSubscribedClientShouldNotReceiveMessage() {
        raceResults.sendMessageByCategory(message,Category.F1_Races);
        verify(clientA, never()).receive(message);
        verify(clientB, never()).receive(message);
    }

    @Test
    public void subscribedClientShouldReceiveMessage() {
        Client client = mock(Client.class);
        Message message = mock(Message.class);

        raceResults.addSubscriber(client,Category.F1_Races);
        raceResults.sendMessageByCategory(message,Category.F1_Races);
        verify(client).receive(message);
    }

    @Test
    public void messageShouldBeSentToAllSubscribers() {
        Message message = mock(Message.class);
        raceResults.addSubscriber(clientA,Category.F1_Races);
        raceResults.addSubscriber(clientB,Category.F1_Races);
        raceResults.sendMessageByCategory(message,Category.F1_Races);
        verify(clientA).receive(message);
        verify(clientB).receive(message);
    }

    @Test
    public void shouldSendOnlyOneMessageToMultiSubscriber() {
        raceResults.addSubscriber(clientA,Category.F1_Races);
        raceResults.addSubscriber(clientA,Category.F1_Races);
        raceResults.sendMessageByCategory(message,Category.F1_Races);
        verify(clientA,times(1)).receive(message);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveMessages() {
        raceResults.addSubscriber(clientA,Category.F1_Races);
        raceResults.removeSubscriber(clientA);
        raceResults.sendMessageByCategory(message,Category.F1_Races);
        verify(clientA, never()).receive(message);
    }
}
