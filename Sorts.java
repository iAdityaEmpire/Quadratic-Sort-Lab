
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class Sorts {
	private int[] nos;
	private int steps;

	// Constructs a default nosay of size 10
	public Sorts() {
		nos = new int[10];
		nos[0] = -10001;
		nos[1] = 3;
		nos[2] = 7;
		nos[3] = 19;
		nos[4] = 15;
		nos[5] = 19;
		nos[6] = 7;
		nos[7] = 3;
		nos[8] = 19;
		nos[9] = -100;

	}

	public Sorts(int[] temp) {
		nos = temp;
	}

	// Constructs an nosay with size random Sorts from [0,range)
	public Sorts(int size, int range) {
		int a = 0;
		nos = new int[size];
		for (int i = 0; i < nos.length; i++) {
			a = (int) (Math.random() * range);
			nos[i] = a;
		}

	}
	// Constructs an array of random Sorts [0-range) array of size count with a
	// seed
	// The seed allows you to use the same set of random numbers

	public Sorts(int count, int range, long seed) {
        Random generator = new Random(seed);
		nos = new int[count];
		for(int i = 0; i < nos.length; i++) {
			nos[i] = generator.nextInt(range);
            // System.out.println(nos[i]);
		}

	}

	// This constructor will create an ordered nosay of consecutive integers
	// true will yield ascending order
	// false will yield descending order
	public Sorts(int count, boolean ordered) {
		
		nos = new int[count];

		if (ordered) {
			for (int i = 0; i < nos.length; i++) {
				nos[i] = i;
			}
		} else {
			int a=0;
			for (int i = count-1; i > 0; i--) {
				nos[a] = i;
				a++;
			}
		}
	}

	public int getSteps() {
		return steps;
	}

	public void display() {
			for (int x : nos) {
				System.out.print(x + " ");
				System.out.println();
			}
		}

	public int[] getNos() {
		return nos;
	}

  	public int getSize() {
		return nos.length;
	}

	public void swap(int x, int y) {
		int temp = nos[x];
		nos[x] = nos[y];
		nos[y] = temp;
		steps += 3;
	}
	
	public void insertionSort() {
        steps = 0;
        for (int i = 1; i < nos.length; i++) { 
            int temp = nos[i]; 
            steps++;
            int j = i - 1; 
            while (j >= 0 && nos[j] > temp) { 
                steps++;
                nos[j + 1] = nos[j]; 
                j--;
            } 
            steps++;
            nos[j + 1] = temp; 
        }
	}
	
	public void selectionSort() {
        steps = 0;
		for (int i = 0; i < nos.length-1; i++) 
        { 
            int minIndex = i; 
            steps++;
            for (int j = i+1; j < nos.length; j++) {
                steps++;
            	if (nos[j] < nos[minIndex]) {
                    minIndex = j; 
                    steps++;
            	}
            }
  
            int temp = nos[minIndex]; 
            nos[minIndex] = nos[i]; 
            nos[i] = temp; 
           steps +=4;
        } 
	}
	
	
	public void bubbleSort() {

			steps = 0;
			boolean swapped = true;
			steps++;
			int lastSwap = nos.length - 1;
			
			steps++;
			int temp = 0;
			steps++;
			steps++; // initialize for loop
			for (int i = 0; i < nos.length; i++) {
				steps += 3; // boundary check, increment,if
				if (swapped) {
						swapped = false;
						steps++;
						steps++; // initialize for loop
						for (int j = 0; j < lastSwap; j++) {
							steps += 3; // boundary check, increment,if
							if (nos[j] > nos[j + 1]) {
								swap(j, j + 1);
								swapped = true;
								steps++;
								temp = j;
								steps++;
							}
						}
						lastSwap = temp;
						steps++;
					}
				}
	}

  public void quadraticSort(){
        int temp1;
        int[] temp = new int[nos.length];
        for (int i = nos.length-1; i > 0 ; i--) { 
            for (int j = temp.length-1; j >1; j--){
                temp[j] = nos[i];
                if (temp[j -1] > temp[j]){
                   temp1 = temp[j-1];
                   temp[j] = temp[j-1];
                   temp[j-1] = temp[j];
                }
            }
        }

    
        for(int i =0; i < temp.length; i++){
          nos[i] = temp[i];
        }  
    }



}
