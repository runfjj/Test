package UpperToLow;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	protected LowerCaseInputStream(InputStream in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	public int read() throws IOException {
		int c = super.read();
		return (c==-1?c:Character.toLowerCase((char)c));
	}
}
