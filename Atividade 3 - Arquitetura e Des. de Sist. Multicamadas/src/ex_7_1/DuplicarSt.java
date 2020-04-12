package ex_7_1;

public class DuplicarSt extends ManipuladorAbstrato {
	protected String transformarString(String string) {
		return string + " " + string;
	}
}
