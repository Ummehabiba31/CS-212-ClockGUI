import java.io.File; //importing for reading a file
import java.util.Scanner;//scanner class reads from the file
import java.io.FileNotFoundException;
import java.util.*; //that will bring the class StringTokenizer


public class Project1 {
	/**
	 * 
	 * @param array the method takes array parameter of the Clock object.
	 * @return the selectionSort method is a void method
	 */
	
	public static void selectionSort(Clock array[]){  
        for (int i = 0; i < array.length - 1; i++)  
        {  
            int index = i; 
            //index is for pointing the smallest number
            
            for (int j = i + 1; j < array.length; j++){  
                if (array[j].getHour() < array[index].getHour()){  
                    index = j;//searching for lowest index  
                }  
            }  
            if(array[i].getHour() > array[index].getHour()) {  
            	Clock smallerNumber = array[index];
            	array[index] = array[i];  
            	array[i] = smallerNumber;  
            }
        }  
    }  
	
	public static void main(String []args) {
		
		
		
		Clock[] array1 = new Clock[14];
		Clock[] array2 = new Clock[14];
//Reading the file 
	File f = new File("project1.txt");
	Scanner inputStream = null;
	//throwing exception if the specific file cannot be found.
	try {
	inputStream = new Scanner (f);
	}
	catch(FileNotFoundException e) {
		System.out.println("File not found!!");
		System.exit(0);
	}
	//index keeps track of the array
	int index =0;
	
	while(inputStream.hasNextLine()) {
		String line = inputStream.nextLine(); 
		if(line == null || line =="")
			break;
		StringTokenizer st =new StringTokenizer(line,":");
		
		if(st.countTokens()==3) {//......ask the instructor

			int h=0, m=0, s=0;
			//creating a clock object.
			Clock c1 = new Clock(h,m,s);
			Clock c2 = new Clock(h,m,s);
			
				 h= Integer.parseInt(st.nextToken());
				
					 m = Integer.parseInt(st.nextToken());
					
				
					 s = Integer.parseInt(st.nextToken());
					
				
			
			c1.setHour(h);
			c1.setMinute(m);
			c1.setSecond(s);
		array1[index]= c1; //....how to put object to array
		c2.setHour(h);
		c2.setMinute(m);
		c2.setSecond(s);
		array2[index]=c2;
		//incrementing index 
				index++;
		}//end of if(st.Tokens==3)
		else{//if the line of the file does not have 3 tokens exactly print it to the console
			System.out.println(line);
			
		}
		
		
	}//end of the while loop
	
	
	//selection sort
	selectionSort(array2);
	
	

	
	
	//displaying the program
	ClockGUI g = new ClockGUI();
	g.display(array1, array2);
	inputStream.close();
	}  
}
