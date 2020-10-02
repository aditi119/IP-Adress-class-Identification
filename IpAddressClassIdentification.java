import java.util.Scanner;


public class IpAddressClassIdentification{

                public static void main(String args[])
 			{
				Scanner sc = new Scanner(System.in);
			
				String s; int c=0;
				System.out.print("Enter IP Address:");
				System.out.print("\n");
				s = sc.next();
 				String ip[] = s.split("\\.");
				
				int len= ip.length;
				
				if(len == 4)
				{
				 for(int i=0;i<4;i++)
	  			{
				  int ipa =Integer.parseInt(ip[i]);

                              	 if(  ipa >= 0 && ipa <= 127)
				  	c=c+1;
			      
				else if(  ipa >=128 && ipa <= 191)
				        c=c+1;
				
				else if(  ipa >=192 && ipa <= 223)
					c=c+1;
				
				else if(  ipa >=224 && ipa <= 239)
				 	c=c+1;
								
				else if(  ipa >=240 && ipa <= 255)
				 	c=c+1;	
				else
				     System.out.print("Invalid IP Address range");						
				} 
				}
				
				else
				{
				  System.out.print("Invalid Input");
				}
		       
                      if(c==4)
			{

				System.out.print("Octet value :" + ip[0]);
				 System.out.print("\n");
				int ipa =Integer.parseInt(ip[0]);

                               if(  ipa >= 0 && ipa <= 127)
				  System.out.print("IP address belongs to Class A");
			      
				else if(  ipa >=128 && ipa <= 191)
				  System.out.print("IP address belongs to Class B");
				
				else if(  ipa >=192 && ipa <= 223)
				  System.out.print("IP address belongs to Class C");
				
				else if(  ipa >=224 && ipa <= 239)
				  System.out.print("IP address belongs to Class D");
								
				else if(  ipa >=240 && ipa <= 255)
				  System.out.print("IP address belongs to Class E"); 
					
			}

}

}
