
class Err {
  String msg; // error message
  int severity; // code indicating severity of error
  Err(String m, int s) {
    msg = m;
    severity = s;
  }
}


class ErrInfo {
	  String msgs[] = {
	    "Output Error",
	    "Input Error",
	    "Disk Full",
	    "Index Out-Of-Bounds"
	  };
	  int howbad[] = { 3, 3, 2, 4 };
	  Err getErrorInfo(int i) {
	    if(i >= 0 & i < msgs.length)
	      return new Err(msgs[i] , howbad[i]);
	    else
	      return new Err("Invalid Error Code", 0);
	  }
	}

class ErrorInfo {
	public static void main(String args[]) {
		ErrInfo err = new ErrInfo();
		Err e;
		e = err.getErrorInfo(2);
		System.out.println(e.msg + " severity: " + e.severity);
		e = err.getErrorInfo(19);
		System.out.println(e.msg + " severity: " + e.severity);
	}
}