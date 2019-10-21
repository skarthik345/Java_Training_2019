package assesment_1_10_Oct.ass2;


public class Musician {
		private String name;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

		public void playInstrument(Instrument instrument) {
			instrument.playSound();
}
}