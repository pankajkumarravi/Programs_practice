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

public class TreeProm {
	public static void main(String[] args) {
		Map<Code, String> cource = new TreeMap<>();
		/*
		 * Map<Integer, String> cource = new TreeMap<Integer, String>(); cource.put(2,
		 * "Java"); cource.put(3, "Python"); cource.put(7, "Java script");
		 * cource.put(10, "AJAX"); cource.put(01, "JQuery");
		 */
		cource.put(new Code("SOO1", "LAC1"), "Java");
		cource.put(new Code("SOO3", "LAC3"), "Python");
		cource.put(new Code("SOO5", "LAC5"), "Java script");
		cource.put(new Code("SOO9", "LAC9"), "AJAX");
		cource.put(new Code("SOO10", "LAC10"), "JQuery");
		cource.put(new Code("SOO1", "LAC1"), "SQL");
		for (Map.Entry<Code, String> entry : cource.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
		}
		
		Code code1=new Code("SOO1", "LAC1");
		Code code2=new Code("SOO1", "LAC1");
		//System.out.println("Coce 1 hashcod : "+code1.hashCode()+" code 2 hashcode : "+code2.hashCode());
		//System.out.println(code1.equals(code2)); // 
		
		//System.out.println(code1 == code2);
		
		//String s1="pankaj";
		//String s2="pankaj";
		//System.out.println(s1==s2);
		//System.out.println("Name 1 hashcode "+s1.hashCode()+" name 2 hashcode "+s2.hashCode()); //o/p ==> true
		
		//String nam1=new String("Ravi");
		//String nam2=new String("Ravi");
		//System.out.println(nam1==nam2); //o/p == >false 
		//System.out.println(nam1.equals(nam2));
		
		
		
		
	}
}
