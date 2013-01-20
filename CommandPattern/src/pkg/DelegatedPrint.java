package pkg;

public class DelegatedPrint implements Print{
	private DatePrint datePrint;
	private String msg;
	
	public DelegatedPrint(String _msg){
		datePrint = new DatePrint();
		msg = _msg;
	}
	
	@Override
	public void print() {
		datePrint.printDate(msg);
	}
}
