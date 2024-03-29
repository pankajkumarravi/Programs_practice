import java.util.Map;
import java.util.TreeMap;
class Code implements Comparable<Code> {
	private String selectionNo;
	private String courceName;

	public Code(String selectionNo, String courceName) {
		this.selectionNo = selectionNo;
		this.courceName = courceName;
	}

	@Override
	public String toString() {
		return "Code [selectionNo=" + selectionNo + ", courceName=" + courceName + "]";
	}

	public String getSelectionNo() {
		return selectionNo;
	}

	public void setSelectionNo(String selectionNo) {
		this.selectionNo = selectionNo;
	}

	public String getCourceName() {
		return courceName;
	}

	public void setCourceName(String courceName) {
		this.courceName = courceName;
	}

	@Override
	public int compareTo(Code o) {
		String codde1 = selectionNo.concat(courceName);
		String code2 = o.getSelectionNo() + o.getCourceName();
		return codde1.compareTo(code2);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courceName == null) ? 0 : courceName.hashCode());
		result = prime * result + ((selectionNo == null) ? 0 : selectionNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Code other = (Code) obj;
		if (courceName == null) {
			if (other.courceName != null)
				return false;
		} else if (!courceName.equals(other.courceName))
			return false;
		if (selectionNo == null) {
			if (other.selectionNo != null)
				return false;
		} else if (!selectionNo.equals(other.selectionNo))
			return false;
		return true;
	}

}

public class SearchAlgo {
   public static void main(String[] args) {
	
	   Map<Code, String>  lacture=new TreeMap<>();
	   lacture.put(new Code("S01", "L01"),"Maps Collection");
	   lacture.put(new Code("S03", "L04"),"Generice");
	   lacture.put(new Code("S05", "L05"),"IO");
	   lacture.put(new Code("S06", "L07"),"Exception handling");
	   lacture.put(new Code("S09", "L009"),"OOPS");
	   lacture.put(new Code("S010", "L019"),"Methods");
	   lacture.put(new Code("S01", "L01"),"Set collection");
	   
	  // System.out.println(lacture.get(new Code("S01", "L01")));
	    
	   Code code=null;
	     for(Map.Entry<Code, String> entry:lacture.entrySet())
	     {
	    	 if(entry.getValue().equals("OOPS")) {
	    		 code=entry.getKey();
	    		 System.out.println("Key for value  : \"OOPS\""+code  );
	    	 }
	    	// System.out.println("Key : " + entry.getKey()+" value : "+entry.getValue());
	    	
	     }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
 }
}
