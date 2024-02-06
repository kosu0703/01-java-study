package com.ict.day22;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02_Paint extends JFrame{	//	창
	//	창 화면
	JPanel jp;
	//	버튼
	JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7;
	//	굵기 옵션
	String[] items = {"5","10","15","20","25","30"}; 
	JComboBox<String> jcom;
	//	x축, y축 좌표값 / wh 너비값
	int x = -5 , y = -5 , wh = 5 ;
	//	컬러 
	Color color;
	
	//	내부클래스 (그림그리기)
	CanvasTest ct = new CanvasTest();
	
	public Ex02_Paint() {
		super("미니그림판");
		
		jp = new JPanel();
		
		//	버튼에 컬러 지정
		jb1 = new JButton(" ");
		jb1.setBackground(color.RED);
		jb2 = new JButton(" ");
		jb2.setBackground(color.GREEN);
		jb3 = new JButton(" ");
		jb3.setBackground(color.BLUE);
		jb4 = new JButton(" ");
		jb4.setBackground(color.CYAN);
		jb5 = new JButton(" ");
		jb5.setBackground(color.MAGENTA);
		jb6 = new JButton(" ");
		jb6.setBackground(color.YELLOW);
		
		//	clear 버튼
		jb7 = new JButton("clear");
		
		//	combo box
		jcom = new JComboBox<String>(items);
		
		//	화면에 버튼 추가
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		jp.add(jb7);
		jp.add(jcom);
		
		//	버튼 위치 설정
		add(jp, BorderLayout.NORTH);
		add(ct, BorderLayout.CENTER);
		
		//	화면 크기 구하기
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		
		//	위치 지정
		//	초기값은 모니터 중앙에서 부터 화면이 만들어짐 (즉, 좌상단이 중앙)
		//	따라서 너비의 반에서 -300 만큼, 높이의 반에서 -300 만큼 옮기면 (x축 오른쪽이 + / y축 아래쪽이 +)
		//	총 화면의 크기가 600, 600 이므로 화면의 중앙이 모니터의 중앙이 된다.
		setBounds(ds.width/2-300, ds.height/2-300, 600, 600);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		//	버튼 누르면 컬러 변경하기 (이벤트)
		//	리스너 듣고, 액션 행동하라 (인터페이스 ActionListener)
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = color.RED;
			}
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = color.GREEN;
			}
		});
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = color.BLUE;
			}
		});
		jb4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = color.CYAN;
			}
		});
		jb5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = color.MAGENTA;
			}
		});
		jb6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = color.YELLOW;
			}
		});
		
		//	지우기
		jb7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ct.removeNotify();
				ct.addNotify();
				x = -5;
				y = -5;
				wh = 5;
				//	크기 지정
				jcom.setSelectedIndex(0);
			}
		});
		
		//	콤보 박스에서 옵션 선택하면 크기 지정
		jcom.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {	//	선택된게 e
				if (e.getStateChange() == e.SELECTED) {
					switch ((String)e.getItem()) {
					case "5":	wh = 5;		break;
					case "10":	wh = 10;	break;
					case "15":	wh = 15;	break;
					case "20":	wh = 20;	break;
					case "25":	wh = 25;	break;
					case "30":	wh = 30;	break;
					}
				}
			}
		});
		
		//	마우스 눌러서 움직이는 것을 받아들인다.
		//	추상클래스 MouseAdapter 사용
		ct.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				//	x 좌표 , y 좌표 얻어서 전역변수에 넣기
				x = e.getX();
				y = e.getY();
				ct.repaint();
			}
		});
		//	아래처럼 해도 되지만 인터페이스는 추상메서드 2개 다 오버라이드 해야됨 
		//	하지만 1개만 사용할거라 위의 추상클래스 사용
//		ct.addMouseMotionListener(new MouseMotionListener() {
//			@Override
//			public void mouseMoved(MouseEvent e) {
//			}
//			@Override
//			public void mouseDragged(MouseEvent e) {
//			}
//		});
		
		//	**캐치마인드 하려면 클라이언트가
		//	x, y, 너비, 색상을 서버로 보내줘야 모든 사람이 받을 수 있다. 
		//	즉, x y 너비 색상 글자를 프로토콜로 넣어서 객체로 만들면 객체 통신 가능
	}
	
	//	내부클래스
	private class CanvasTest extends Canvas{
		//	그림그리기
		@Override
		public void paint(Graphics g) {
			g.setColor(color);			//	색 설정
			g.fillOval(x, y, wh, wh);	//	x, y , 높이, 너비
		}
		//	그림 업데이드
		@Override
		public void update(Graphics g) {
			paint(g);
		}
		
	}
	
	public static void main(String[] args) {
		new Ex02_Paint();
		
	}
	
	
}
