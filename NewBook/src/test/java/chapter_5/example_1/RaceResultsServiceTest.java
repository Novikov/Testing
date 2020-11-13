package chapter_5.example_1;
import chapter_5.example_1.Client;
import chapter_5.example_1.Message;
import chapter_5.example_1.RaceResultsService;
import org.junit.Test;

import static org.mockito.Mockito.*;


public class RaceResultsServiceTest {


   private RaceResultsService raceResults = new RaceResultsService();
   private Message message = mock(Message.class);
   private Client clientA = mock(Client.class, "clientA");
   private Client clientB = mock(Client.class, "clientB");

    @Test
    public void notSubscribedClientShouldNotReceiveMessage() {
        raceResults.send(message);
        verify(clientA, never()).receive(message);
        verify(clientB, never()).receive(message);
    }

    @Test
    public void subscribedClientShouldReceiveMessage() {
        Client client = mock(Client.class);
        Message message = mock(Message.class);

        raceResults.addSubscriber(client);
        raceResults.send(message);
        verify(client).receive(message);
    }

    @Test
    public void messageShouldBeSentToAllSubscribedClients() {
        Message message = mock(Message.class);
        raceResults.addSubscriber(clientA);
        raceResults.addSubscriber(clientB);
        raceResults.send(message);
        verify(clientA).receive(message);
        verify(clientB).receive(message);
    }

    @Test
    public void shouldSendOnlyOneMessageToMultiSubscriber() {
        raceResults.addSubscriber(clientA);
        raceResults.addSubscriber(clientA);
        raceResults.send(message);
        verify(clientA).receive(message);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveMessages() {
        raceResults.addSubscriber(clientA);
        raceResults.removeSubscriber(clientA);
        raceResults.send(message);
        verify(clientA, never()).receive(message);
    }
}
