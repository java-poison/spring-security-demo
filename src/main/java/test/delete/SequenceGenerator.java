package test.delete;

import java.util.List;

public class SequenceGenerator {
	private List<Object> suffixes;
	private String prefix;
	// private String suffix;
	private int initial;
	private int counter;

	public SequenceGenerator() {
	}

	/*
	 * public SequenceGenerator(String prefix, String suffix, int initial) {
	 * this.prefix = prefix; this.suffix = suffix; this.initial = initial; }
	 */

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	/*
	 * public void setSuffix(String suffix) { this.suffix = suffix; }
	 */

	public void setInitial(int initial) {
		this.initial = initial;
	}

	/*
	 * public synchronized String getSequence() { StringBuffer buffer = new
	 * StringBuffer(); buffer.append(prefix); buffer.append(initial +
	 * counter++); buffer.append(suffix); return buffer.toString(); }
	 */

	public void setSuffixes(List<Object> suffixes) {
		this.suffixes = suffixes;
	}

	public synchronized String getSequence() {
		StringBuffer buffer = new StringBuffer();
		for (Object suffix : suffixes) {
			buffer.append("-");
			buffer.append(suffix);
		}
		return buffer.toString();
	}
}
