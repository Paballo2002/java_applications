/**
 * 
 */
package credit_card_project;

/**
 * 
 */
public class UserAccount 
{
     private int userpin;
     private double useramount;
     
	public UserAccount(double useramount) {
		this.useramount = useramount;
		this.userpin = 2001;
	}
	public int getUserpin() {
		return userpin;
	}
	public double getUseramount() {
		return useramount;
	}
	public void setUseramount(double useramount) {
		this.useramount = useramount;
	}    
}
