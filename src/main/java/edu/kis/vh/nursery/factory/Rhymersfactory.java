package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;

// here

public interface Rhymersfactory {

	public defaultCountingOutRhymer GetStandardRhymer();

	public defaultCountingOutRhymer GetFalseRhymer();

	public defaultCountingOutRhymer GetFIFORhymer();

	public defaultCountingOutRhymer GetHanoiRhymer();

}
