import javax.swing.JOptionPane;
class tgsMat22{
public static void main(String[] args){
String [] data= new String[3];
for(int i=0;i<=2;i++){
    String msg="";
if(i==0){msg="Nama";}else if(i==1){msg="NIM";} else if(i==2){msg="Alamat";}
data[i]=JOptionPane.showInputDialog(null,msg +" Anda:","Input Data",JOptionPane.QUESTION_MESSAGE);
}
for(int i=0;i<=2;i++){
        String msg="";
        if(i==0){msg="Nama";}else if(i==1){msg="NIM";} else if(i==2){msg="Alamat";}
    JOptionPane.showMessageDialog(null,msg+" Anda : "+data[i], "Informasi Data ",JOptionPane.INFORMATION_MESSAGE);
}
}}