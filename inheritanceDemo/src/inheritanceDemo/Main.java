package inheritanceDemo;

public class Main {

	private static final BaseKrediManager OgretmenKrediManager = null;

	public static void main(String[] args) {
		//OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager()	;
		//ogretmenKrediManager.hesapla();

		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		krediUI.KrediHesapla(new AskerKrediManager());
	}

}
