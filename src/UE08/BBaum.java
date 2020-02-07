package UE08;
class BBaum<T extends Comparable<T>>
{
	public BKnoten<T> wurzel;

	public BBaum(BKnoten<T> wurzel)
	{
		assert(wurzel != null);

		this.wurzel = wurzel;
	}

	// Wrapper-Methode
	public void traversieren()
	{
		traversieren(wurzel);
	}

	// Eigentliche Implementierung
	private void traversieren(BKnoten<T> knoten)
	{
		if(knoten == null)
			return;
		traversieren(knoten.kinder[0]);

		for(int a = 0; a <knoten.elemente.length;a++){
			System.out.print(knoten.elemente[a] + " ");
			traversieren(knoten.kinder[a+1]);
		}
	}

	// Wrapper-Methode
	public boolean suchen(final T daten)
	{
		assert(daten != null);

		return suchen(daten, wurzel);
	}

	// Eigentliche Implementierung
	private boolean suchen(final T daten, BKnoten<T> knoten)
	{
		// Leerer Teilbaum
		if (knoten == null)
			return false;

		for (int a=0; a < knoten.elemente.length; a++)
		{
			// Gesuchtes Element mit Element im Knoten vergleichen
			final int cmp = daten.compareTo(knoten.elemente[a]);

			// Das Element wurde gefunden!
			if (cmp == 0)
				return true;

			// Das gesuchte Element ist kleiner als das Vergleichselement:
			// wir suchen im Teilbaum links vom Vergleichselement weiter.
			if (cmp < 0)
				return suchen(daten, knoten.kinder[a]);
		}

		// Im Teilbaum ganz rechts weitersuchen
		return suchen(daten, knoten.kinder[knoten.elemente.length]);
	}
}