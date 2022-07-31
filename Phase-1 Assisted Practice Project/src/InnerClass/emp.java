package InnerClass;

import InnerClass.employee.peremployee;
import InnerClass.employee.tememployee;

class employee{
	double salary;
	employee(){
		salary=60000;
	}
	class peremployee{
		String code="PE01";
		double hike=0.45;
		void new_salary(){
			System.out.println("New salary of the permenant emp after hike "+ (salary+salary*hike));
		}
		void display(){
			System.out.println("salary is "+salary+" code is "+code+" hike is "+hike+"\n");
		}
	}
	class tememployee{
		String code="TE01";
		double hike=0.30;
		void new_salary(){
			System.out.println("New salary of the temp emp after hike "+ (salary+salary*hike));
		}
		void display(){
			System.out.println("salary is "+salary+" code is "+code+" hike is "+hike+"\n");
		}
	}
	void role(){
		class contractemployee{
			String code="CE01";
			double hike=0.30;
			void new_salary(){
				System.out.println("New salary of the conctract emp after hike "+ (salary+salary*hike));
			}
			void display(){
				System.out.println("salary is "+salary+" code is "+code+" hike is "+hike+"\n");
			}
			
			
		}
		contractemployee co=new contractemployee();
		co.new_salary();
		co.display();
	}
}
public class emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee em=new employee();
		employee.peremployee per=em.new peremployee();
		per.new_salary();
		per.display();
		
		employee.tememployee tem=em.new tememployee();
		tem.new_salary();
		tem.display();
		
		em.role();

	}

}

