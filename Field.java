import java.awt.event.* ;



public class Field
{
	int m_irgField [] [] = new int [ 8 ] [ 8 ] ;
	int m_iClickX ;
	int m_iClickY ;
	int m_iUser1Cnt ;
	int m_iUser2Cnt ;
	
	
	Field ()
	{
		for ( int i = 0 ; i < 8 ; ++i )
		{
			for ( int j = 0 ; j < 8 ; ++i )
			{
				m_irgField [ i ] [ j ] = 0 ;		// Empty Field
			}
		}
		
		
		m_irgField [ 3 ] [ 3 ] = 1 ;		// User 1
		m_irgField [ 4 ] [ 4 ] = 1 ;
		m_irgField [ 3 ] [ 4 ] = 2 ;		// User 2
		m_irgField [ 4 ] [ 3 ] = 2 ;
		
		m_iClickX = 0 ;
		m_iClickY = 0 ;
		m_iUser1Cnt = 2 ;
		m_iUser2Cnt = 2 ;
	}
	
	public void MousePressed ( MouseEvent UserMouse )
	{
		if ( ! UserMouse.isMetaDown () )
		{
			m_iClickX = UserMouse.getX () ;
			m_iClickY = UserMouse.getY () ;
		}
	}
	
	public boolean bCheck ( int iX , int iY , int iUser )
	{
		if ( 0 == m_irgField [ iX ] [ iY ] )
			return true ;
		else
			return false ;
	}
	
	public void SetDisk ( int iX , int iY , int iUser )
	{
		m_irgField [ iX ] [ iY ] = iUser ;
		
		
		if ( 1 == iUser )
			++ m_iUser1Cnt ;
		else
			++ m_iUser2Cnt ;
		
		
		SpinAll ( iX , iY , iUser ) ;
	}
	public void SpinAll ( int iX , int iY , int iUser )
	{
		Spin_1 ( iX , iY , iUser ) ;
		Spin_2 ( iX , iY , iUser ) ;
		Spin_3 ( iX , iY , iUser ) ;
		Spin_4 ( iX , iY , iUser ) ;
		Spin_5 ( iX , iY , iUser ) ;
		Spin_6 ( iX , iY , iUser ) ;
		Spin_7 ( iX , iY , iUser ) ;
		Spin_8 ( iX , iY , iUser ) ;
		
	}
	public void Spin_1 ( int iX , int iY , int iUser )
	{
		int iEnemy = 0 ;
		int iCnt = 0 ;
		

		if ( 1 == iUser )																	//     4
			iEnemy = 2 ;																	//   8   5
		else																				// 3       1
			iEnemy = 1 ;																	//   7   6
																							//     2
		
		
		for ( int i = iX + 1 ; i < 8 ; ++i )												// 1
		{
			if ( iEnemy == m_irgField [ i ] [ iY ] )
				++ iCnt ;
			else
				break ;
		}
		
		if ( 0 != iCnt )
		{
			for ( int i = 1 ; i <= iCnt ; ++i )
			{
				m_irgField [ iX + i ] [ iY ] = iUser ;
			}
		}
		
		if ( 1 == iUser )
		{
			m_iUser1Cnt += iCnt ;
			m_iUser2Cnt -= iCnt ;
		}
		else
		{
			m_iUser2Cnt += iCnt ;
			m_iUser1Cnt -= iCnt ;
		}
	}
	public void Spin_2 ( int iX , int iY , int iUser )
	{
		int iEnemy = 0 ;
		int iCnt = 0 ;
		

		if ( 1 == iUser )																	//     4
			iEnemy = 2 ;																	//   8   5
		else																				// 3       1
			iEnemy = 1 ;																	//   7   6
																							//     2
		
		
		for ( int j = iY + 1 ; j < 8 ; ++j )												// 2
		{
			if ( iEnemy == m_irgField [ iX ] [ j ] )
				++ iCnt ;
			else
				break ;
		}
		
		if ( 0 != iCnt )
		{
			for ( int j = 1 ; j <= iCnt ; ++j )
			{
				m_irgField [ iX ] [ iY + j ] = iUser ;
			}
		}
		
		if ( 1 == iUser )
		{
			m_iUser1Cnt += iCnt ;
			m_iUser2Cnt -= iCnt ;
		}
		else
		{
			m_iUser2Cnt += iCnt ;
			m_iUser1Cnt -= iCnt ;
		}
	}
	public void Spin_3 ( int iX , int iY , int iUser )
	{
		int iEnemy = 0 ;
		int iCnt = 0 ;
		

		if ( 1 == iUser )																	//     4
			iEnemy = 2 ;																	//   8   5
		else																				// 3       1
			iEnemy = 1 ;																	//   7   6
																							//     2
		
		
		for ( int i = iX - 1 ; i >= 0 ; --i )												// 3
		{
			if ( iEnemy == m_irgField [ i ] [ iY ] )
				++ iCnt ;
			else
				break ;
		}
		
		if ( 0 != iCnt )
		{
			for ( int i = 1 ; i <= iCnt ; ++i )
			{
				m_irgField [ iX - i ] [ iY ] = iUser ;
			}
		}
		
		if ( 1 == iUser )
		{
			m_iUser1Cnt += iCnt ;
			m_iUser2Cnt -= iCnt ;
		}
		else
		{
			m_iUser2Cnt += iCnt ;
			m_iUser1Cnt -= iCnt ;
		}
	}
	public void Spin_4 ( int iX , int iY , int iUser )
	{
		int iEnemy = 0 ;
		int iCnt = 0 ;
		

		if ( 1 == iUser )																	//     4
			iEnemy = 2 ;																	//   8   5
		else																				// 3       1
			iEnemy = 1 ;																	//   7   6
																							//     2
		
		
		for ( int j = iY - 1 ; j >= 8 ; ++j )												// 4
		{
			if ( iEnemy == m_irgField [ iX ] [ j ] )
				++ iCnt ;
			else
				break ;
		}
		
		if ( 0 != iCnt )
		{
			for ( int j = 1 ; j <= iCnt ; ++j )
			{
				m_irgField [ iX ] [ iY - j ] = iUser ;
			}
		}
		
		if ( 1 == iUser )
		{
			m_iUser1Cnt += iCnt ;
			m_iUser2Cnt -= iCnt ;
		}
		else
		{
			m_iUser2Cnt += iCnt ;
			m_iUser1Cnt -= iCnt ;
		}
	}
	public void Spin_5 ( int iX , int iY , int iUser )
	{
		int iEnemy = 0 ;
		int iCnt = 0 ;
		

		if ( 1 == iUser )																	//     4
			iEnemy = 2 ;																	//   8   5
		else																				// 3       1
			iEnemy = 1 ;																	//   7   6
																							//     2
		
		
		for ( int i = iX + 1 , j = iY - 1 ; ( i < 8 ) && ( j >= 0 ) ; ++i , --j )			// 5
		{
			if ( iEnemy == m_irgField [ i ] [ j ] )
				++ iCnt ;
			else
				break ;
		}
		
		if ( 0 != iCnt )
		{
			for ( int i = 1 , j = 1 ; ( i <= iCnt ) && ( j <= iCnt ) ; ++i , ++j )
			{
				m_irgField [ iX + i ] [ iY - i ] = iUser ;
			}
		}
		
		if ( 1 == iUser )
		{
			m_iUser1Cnt += iCnt ;
			m_iUser2Cnt -= iCnt ;
		}
		else
		{
			m_iUser2Cnt += iCnt ;
			m_iUser1Cnt -= iCnt ;
		}
	}
	public void Spin_6 ( int iX , int iY , int iUser )
	{
		int iEnemy = 0 ;
		int iCnt = 0 ;
		

		if ( 1 == iUser )																	//     4
			iEnemy = 2 ;																	//   8   5
		else																				// 3       1
			iEnemy = 1 ;																	//   7   6
																							//     2
		
		
		for ( int i = iX + 1 , j = iY + 1 ; ( i < 8 ) && ( j < 8 ) ; ++i , ++j )			// 6
		{
			if ( iEnemy == m_irgField [ i ] [ j ] )
				++ iCnt ;
			else
				break ;
		}
		
		if ( 0 != iCnt )
		{
			for ( int i = 1 , j = 1 ; ( i <= iCnt ) && ( j <= iCnt ) ; ++i , ++j )
			{
				m_irgField [ iX + i ] [ iY + i ] = iUser ;
			}
		}
		
		if ( 1 == iUser )
		{
			m_iUser1Cnt += iCnt ;
			m_iUser2Cnt -= iCnt ;
		}
		else
		{
			m_iUser2Cnt += iCnt ;
			m_iUser1Cnt -= iCnt ;
		}
	}
	public void Spin_7 ( int iX , int iY , int iUser )
	{
		int iEnemy = 0 ;
		int iCnt = 0 ;
		

		if ( 1 == iUser )																	//     4
			iEnemy = 2 ;																	//   8   5
		else																				// 3       1
			iEnemy = 1 ;																	//   7   6
																							//     2
		
		
		for ( int i = iX - 1 , j = iY + 1 ; ( i >= 0 ) && ( j < 8 ) ; --i , ++j )			// 7
		{
			if ( iEnemy == m_irgField [ i ] [ j ] )
				++ iCnt ;
			else
				break ;
		}
		
		if ( 0 != iCnt )
		{
			for ( int i = 1 , j = 1 ; ( i <= iCnt ) && ( j <= iCnt ) ; ++i , ++j )
			{
				m_irgField [ iX - i ] [ iY + i ] = iUser ;
			}
		}
		
		if ( 1 == iUser )
		{
			m_iUser1Cnt += iCnt ;
			m_iUser2Cnt -= iCnt ;
		}
		else
		{
			m_iUser2Cnt += iCnt ;
			m_iUser1Cnt -= iCnt ;
		}
	}
	public void Spin_8 ( int iX , int iY , int iUser )
	{
		int iEnemy = 0 ;
		int iCnt = 0 ;
		

		if ( 1 == iUser )																	//     4
			iEnemy = 2 ;																	//   8   5
		else																				// 3       1
			iEnemy = 1 ;																	//   7   6
																							//     2
		
		
		for ( int i = iX - 1 , j = iY - 1 ; ( i >= 0 ) && ( j >= 0 ) ; --i , --j )			// 8
		{
			if ( iEnemy == m_irgField [ i ] [ j ] )
				++ iCnt ;
			else
				break ;
		}
		
		if ( 0 != iCnt )
		{
			for ( int i = 1 , j = 1 ; ( i <= iCnt ) && ( j <= iCnt ) ; ++i , ++j )
			{
				m_irgField [ iX - i ] [ iY - i ] = iUser ;
			}
		}
		
		if ( 1 == iUser )
		{
			m_iUser1Cnt += iCnt ;
			m_iUser2Cnt -= iCnt ;
		}
		else
		{
			m_iUser2Cnt += iCnt ;
			m_iUser1Cnt -= iCnt ;
		}
	}
	
}
