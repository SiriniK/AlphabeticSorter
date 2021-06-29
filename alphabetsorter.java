public class AlphabeticalSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		        String[]array = {"Joyce Byers",
		        		"Jim Hopper",
		        		"Mike Wheeler",
		        		"Eleven",
		        		"Dustin Henderson",
		        		"Lucas Sinclair",
		        		"Nancy Wheeler",
		        		"Jonathan Byers",
		        		"Karen Wheeler",
		        		"Martin Brenner",
		        		"William Byers",
		        		"Max Mayfield",
		        		"Steve Harrington",
		        		"Billy Hargrove",
		        		"Bob Newby",
		        		"Sam Owens",
		        		"Robin Buckley",
		        		"Erica Sinclair",
		        		"Murray Bauman",};
		        putInAlphabeticalOrder(array);
		    }
		    
		    public static void putInAlphabeticalOrder(String[]array){
		        for(int i = 0;i < array.length;i++){
		            for(int j = i + 1;j < array.length;j++){
		                if(array[i].compareTo(array[j]) > 0){
		                    String temp = array[i];
		                    array[i] = array[j];
		                    array[j] = temp;
		                
		                }
		            }
		        }
		        
		        for(int i = 0;i < array.length;i++){
		            System.out.print(array[i] + " ");
		        
		        }
		        
		    }
		    
		    
		
		
	}
