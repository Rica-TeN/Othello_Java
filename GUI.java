import javax.swing.JFrame ;


public class GUI extends JFrame
{
	private final int m_iStartX = 460 ;
	private final int m_iStartY = 100 ;
	private final int m_iEndX = 1460 ;
	private final int m_iEndY = 1100 ;
	
	private final int m_iFieldStartX = 560 ;
	private final int m_iFieldStartY = 200 ;
	private final int m_iFieldEndX = 1360 ;
	private final int m_iFieldEndY = 1000 ;
	
	
	public GUI ()
	{
		super ( "Othello" ) ;
		
		setBounds ( m_iStartX , m_iStartY , m_iEndX - m_iStartX , m_iEndY - m_iStartY ) ;
		setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE ) ;
		setVisible ( true );
	}
}//560 200 1360 1000