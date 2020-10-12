public class Main {
    public static void main(String[] args) {
		StopWatch timer = new StopWatch();

		
		for(int i = 10000; i <= 100000; i+= 10000) {
			Sorts two = new Sorts(i, false);
      Sorts temp3 = two;


			// two.display();
			 timer.reset();
			 timer.start();
            two.bubbleSort();
            System.out.println();
			 timer.stop();
			//  two.display();
			 System.out.println(two.getSize());
			 System.out.println("Reverse order Steps: " + two.getSteps());
       		System.out.println("array time: " + timer.getElapsedTime()+ "milliseconds.");




      			Sorts three = new Sorts(i, false);

			// two.display();
			 timer.reset();
			 timer.start();
            three.selectionSort();
            System.out.println();
			 timer.stop();
			//  two.display();
			//  System.out.println(two.getSize());
			// //  System.out.println("Reverse order Steps: " + two.getSteps());
       		System.out.println("array time: " + timer.getElapsedTime()+ "milliseconds.");

        
        
        Sorts four = new Sorts(i, false);
			// four.display();
			 timer.reset();
			 timer.start();
            four.insertionSort();
            System.out.println();
			 timer.stop();
			//  four.display();
			//  System.out.println(two.getSize());
			 System.out.println("Reverse order Steps: " + four.getSteps());
       		System.out.println("array time: " + timer.getElapsedTime()+ "milliseconds.");
      
    }
  }
}