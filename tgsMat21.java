import java.io.*;
class tgsMat21{
public static void main(String[] args){
BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
String [] data= new String[3];
try{
for(int i=0;i<=2;i++){
    String msg="";
    if(i==0){msg="Nama";}else if(i==1){msg="NIM";} else if(i==2){msg="Alamat";}
    System.out.print("Masukan "+msg+" Anda :");
    data[i]=bf.readLine();
    while(data[i].length()==0||data[i]==""){
        System.out.print("Masukan ulang "+msg+" Anda :");
        data[i]=bf.readLine();}}
    System.out.println("\n");
    System.out.println("========================================");
    for(int i=0;i<=2;i++){
        String msg="";
    if(i==0){msg="Nama";}else if(i==1){msg="NIM";} else if(i==2){msg="Alamat";}
    System.out.println(msg+" Anda : "+data[i]);
    }}
    catch(IOException ex){
    System.out.println("err"+ex);}}
}