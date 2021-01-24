import javax.swing.*;
class PersonInfo {
    private String name;
    private String address;
    private String phoneNo;

//Standard setters

    public void setName(String sname){
        name = sname;
    }
    public void setAddress(String saddress){
        address = saddress;
    }
    public void setPhoneNo(String sphoneNo){
        phoneNo = sphoneNo;
    }

//Standard getters

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
//parameterised constructor
    public PersonInfo(String n, String a,String p){
     setName(n);
     setAddress(a);
     setPhoneNo(p);
    }
//method to display persons record pn GUI

    public void print(){
        JOptionPane.showMessageDialog(null, "name: " +name + "address: "+address + "Phone No.: " +phoneNo);
    }
}
