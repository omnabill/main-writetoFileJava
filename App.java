import java.io.*;  
class App{  
public static void main(String args[])throws Exception{  
  
 FileWriter Writer = new FileWriter("D:\\file1.txt",true);
 InputStreamReader r=new InputStreamReader(System.in);  
 BufferedReader br=new BufferedReader(r);  
 BufferedWriter buffer=new BufferedWriter(Writer); 
  
 String name="";  
  
  while(!name.equals("stop")){  
   System.out.println("Enter data: ");  
   name=br.readLine();  
   buffer.newLine();  
   buffer.write(name+'\n');  
  }  
  
 br.close();  
 r.close();  
 buffer.close();
 }  
}  

