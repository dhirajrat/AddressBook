import javax.swing.*;
import java.util.*;
class AddressBook
{
    ArrayList<PersonInfo> persons;
//constructor
    public AddressBook(){
        persons = new ArrayList<PersonInfo>();
    }
//get input dialog box
    public void addPerson(){
        String name = JOptionPane.showInputDialog("enter the name");
        String add = JOptionPane.showInputDialog("enter the address");
        String pNum = JOptionPane.showInputDialog("enter the phone no.");
//take input in a object PersonInfo
        PersonInfo p= new PersonInfo(name, add, pNum);
//take that object as a element inside a array as an element
        persons.add(p);
    }
//search a person record by name by iterating over arraylist
    public void searchPerson(String n){
        for(int i=0;i<persons.size();i++){
            PersonInfo p = (PersonInfo) persons.get(i);
            if ( n.equals(p.getName()) ){
                p.print();
            }
        }
    }   //end search person
//    delete person by name
    public void deletePerson(String n){
        for(int i=0;i<persons.size();i++){
            PersonInfo p = (PersonInfo) persons.get(i);
            if ( n.equals(p.getName()) ){
                p.print();
                persons.remove(i);
            }
        }
    }
}
