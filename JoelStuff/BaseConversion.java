import java.util.Scanner;														//imports scanner class


class BaseConverter
{
	public static String fromHexToBin(String hex)
	{
		String bin = "";
		String binFragment = "";
		int iHex;
		hex = hex.trim();
		hex = hex.replaceFirst("0x", "");
		
		for(int i = 0; i < hex.length(); i++){
			iHex = Integer.parseInt(""+hex.charAt(i),16);
			binFragment = Integer.toBinaryString(iHex);
			
			while(binFragment.length() < 4){
				binFragment = "0" + binFragment;
				}
				bin += binFragment;
	      }
	      return bin;
	        		    	    	    	    	    		    	    
	        }
	        
	            public static int fromBinToDec(String bin)
	                {
	                	    	double decNum = 0;
	                	    			for (int i=0; i<bin.length(); i++){
	                	    				        	if (bin.charAt(i) == '1'){
	                	    				        		        		decNum=decNum+ Math.pow(2,bin.length()-1-i);
	                	    				        	}
	                	    			}
	                	    				    	
	                	    				    	    	return (int)decNum;    	
	                }
	                
	                    
	                        public static String fromBinToHex(String binNum)
	                            {
	                            	    	String hexNum = "";
	                            	    	    	
	                            	    	    	    	
	                            	    	    	    	    	
	                            	    	    	    	    	    	
	                            	    	    	    	    	    	    	return hexNum;
	                            }    
	                                
	                                    public static String fromDecToAny(int decNum, int desiredBase)
	                                        {
	                                        	    	String newNum = "";
	                                        	    	    	
	                                        	    	    	
	                                        	    	    	    	
	                                        	    	    	    	    	
	                                        	    	    	    	    	    	return newNum;       	
	                                        }
}
