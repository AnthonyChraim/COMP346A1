package comp346pa1w2020;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kerly Titus
 */
class comp546pa1driver {

    /** 
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	 /*******************************************************************************************************************************************
    	  * TODO : implement all the operations of main class   																					*
    	  ******************************************************************************************************************************************/
        
    	Network objNetwork = new Network("network");            /* Activate the network */
        Thread networkThread = new Thread(objNetwork);

        Server objServer = new Server();                                /* Start the server */
        Thread serverThread = new Thread(objServer);

        Client objClient1 = new Client("sending");              /* Start the sending client */
        Thread clientThread1 = new Thread(objClient1);

        Client objClient2 = new Client("receiving");            /* Start the receiving client */
        Thread clientThread2 = new Thread(objClient2);

        networkThread.start();
        serverThread.start();
        clientThread1.start();
        clientThread2.start();
        System.out.println(networkThread);
        System.out.println(serverThread);
        System.out.println(clientThread1);
        System.out.println(clientThread2);
        System.out.println('z');
    }
}
