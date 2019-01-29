package newproblem;

 class registration {
    String Reg_no;
    String Reg_id;
    int URN;
    
     Student cRef;
     
    //Methods
    void setDataForregistration(String no,String id,int roll) {
    	Reg_no=no;
    	Reg_id=id;
    	URN=roll;
    }
    void showDataForregistration() {
    	System.out.println("**************************");
    	System.out.println("**Registration form**");
    	System.out.println("Reg_no\t"+Reg_no);
    	System.out.println("Reg_id\t"+Reg_id);
    	System.out.println("URN\t"+URN);
    	System.out.println("**************************");
    	System.out.println("**form**");
    	cRef.showDataForStudent();
    	
    }
    }
    class Student{
    	String name;
    	String branch;
    	String email;
    	String address;
    	void setDataForStudent(String ne,String br,String id,String add) {
    	    name=ne;
        	branch=br;
        	email=id;
        	address=add;
        }
        void showDataForStudent() {
        	System.out.println("**************************");
        	System.out.println("**Student details**");
        	System.out.println("name\t"+name);
        	System.out.println("branch\t"+branch);
        	System.out.println("email\t"+email);
        	System.out.println("address\t"+address);
        	System.out.println("**************************");
        	
        }	
    	    } 
public class reg {

	public static void main(String[] args) {
		registration r1= new registration();
		Student s1=new Student();
		System.out.println("r1"+r1);
		System.out.println("s1"+s1);
		r1.setDataForregistration("pbi234567","san45@",23457);
		s1.setDataForStudent("sandeep","mca","san23@gmail","nnjhdhch");
		r1.cRef=s1;
		r1.showDataForregistration();
		
		//arr is a new reference varibles
		//it will ti it arr i heap element
		int[] arr=new int[5];
		arr[0]=111;
		//cArr is a new reference variable
		//it will point
		Student[] cArr=new Student[5];
		cArr[0]=new Student();
		cArr[2]=new Student();
		cArr[0] .setDataForStudent("mandeep", "mca","man23@gmail","abcdefgh");
		cArr[2] .setDataForStudent("randeep","mca","ran23@gmail","ijklmnopq");
		cArr[0] .showDataForStudent();
		cArr[2] .showDataForStudent();
		}

		

	}


