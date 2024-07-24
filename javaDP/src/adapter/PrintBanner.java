package adapter;

public class PrintBanner extends Banner implements Print{

	public PrintBanner(String string) {
		super(string);
		
	}

	@Override
	public void prinWeak() {
		this.showWithParen();
		
	}

	@Override
	public void prinStrong() {
		this.showWithAster();
		
	}
	
	
	}

