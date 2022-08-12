package javaFinalProject;

public class MainMenu extends AbstractMenu {
	
	private static final MainMenu instance = new MainMenu(null);
	private static final String MAIN_MENU_TEXT = "1 : 영화 예매하기\n" + "2 : 영화 목록 보기\n" + "3  : 영화 삭제하기\n" + "4 : 관리자 메뉴로 이동\n" + "q : 종료\n\n" + "메뉴를 선택하세요 : ";
	
	private MainMenu(Menu preMenu)
	{
		super(MAIN_MENU_TEXT, preMenu);
	}
	public static MainMenu getInstance()
	{
		return instance;
	}



	@Override
	public Menu next() {
		switch(scanner.nextLine()) {
			case "q" : return preMenu;
			default : return this;
	} 

}
	
}
