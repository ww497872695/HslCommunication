package HslCommunicationDemo;

import HslCommunication.BasicFramework.SoftBasic;
import HslCommunication.Core.Net.NetHandle;
import HslCommunication.Core.Types.OperateResultExOne;
import HslCommunication.Enthernet.SimplifyNet.NetSimplifyClient;
import HslCommunication.Profinet.Siemens.SiemensPLCS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormLoad extends JDialog
{
    public FormLoad(){
        this.setTitle("HslCommunication Test Tool");
        this.setSize(996, 723);
        this.setLocationRelativeTo(null);
        this.setModal(true);
        AddMenuBar();

        JPanel panel = new JPanel();
        panel.setLayout(null);

        AddMelsecGroup(panel);
        AddSiemensGroup(panel);
        AddModbusGroup(panel);
        AddOmronGroup(panel);
        AddKeyenceGroup(panel);
        AddHslGroup(panel);
        this.add(panel);


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                NetSimplifyClient client = new NetSimplifyClient("118.24.36.220", 18467);
                OperateResultExOne<String> read = client.ReadFromServer( new NetHandle(200), SoftBasic.FrameworkVersion.toString( ) );
            }
        });
        thread.start();
    }



    private void AddMenuBar(){
        JMenuBar menuBar = new JMenuBar();
        menuBar.setMargin(new Insets(8,8,8,8));
        menuBar.setBackground(new Color(32,178,170));
        JMenu menuAbout = new JMenu("About");
        menuBar.add(menuAbout);

        JMenu menuChinese = new JMenu("简体中文");
        menuBar.add(menuChinese);

        JMenu menuEnglish = new JMenu("English");
        menuBar.add(menuEnglish);

        JMenu menuChangelog = new JMenu("Changelog");
        menuBar.add(menuChangelog);

        JMenu menuVersion = new JMenu("Version:"+ SoftBasic.FrameworkVersion.toString());
        menuBar.add(menuVersion);

        JMenu menuDisclaimer = new JMenu("Disclaimer" );
        menuBar.add(menuDisclaimer);

        menuBar.setVisible(true);
        this.setJMenuBar(menuBar);
    }

    private void AddMelsecGroup(JPanel panel){
        JPanel buttonPanel = new JPanel(null);
        buttonPanel.setBounds(9,5,183, 319);
        buttonPanel.setBorder(BorderFactory.createTitledBorder( "Melsec [三菱PLC]"));
        int location_y = 24;

        JButton button1 = new JButton( "MC 二进制");
        button1.setBounds(15,location_y,150, 32);
        button1.setFocusPainted(false);
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setVisible(false);
                FormMelsecBinary form = new FormMelsecBinary();
                form.setVisible(true);
                form.dispose();
                setVisible(true);
            }
        });
        buttonPanel.add(button1);
        location_y+=40;

        JButton button2 = new JButton( "MC Ascii");
        button2.setBounds(15,location_y,150, 32);
        button2.setFocusPainted(false);
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setVisible(false);
                FormMelsecAscii form = new FormMelsecAscii();
                form.setVisible(true);
                form.dispose();
                setVisible(true);
            }
        });
        buttonPanel.add(button2);
        location_y+=40;

        JButton button3 = new JButton( "A-1E 二进制");
        button3.setBounds(15,location_y,150, 32);
        button3.setFocusPainted(false);
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setVisible(false);
                FormMelsecA1E form = new FormMelsecA1E();
                form.setVisible(true);
                form.dispose();
                setVisible(true);
            }
        });
        buttonPanel.add(button3);
        location_y+=40;

        panel.add(buttonPanel);
    }

    private void AddSiemensGroup(JPanel panel){
        JPanel buttonPanel = new JPanel(null);
        buttonPanel.setBounds(203,5,183, 319);
        buttonPanel.setBorder(BorderFactory.createTitledBorder( "Siemens [西门子PLC]"));
        int location_y = 24;

        JButton button1 = new JButton( "S7 1200");
        button1.setBounds(15,location_y,150, 32);
        button1.setFocusPainted(false);
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setVisible(false);
                FormSiemensS7 form = new FormSiemensS7(SiemensPLCS.S1200);
                form.setVisible(true);
                form.dispose();
                setVisible(true);
            }
        });
        buttonPanel.add(button1);
        location_y+=40;

        JButton button2 = new JButton( "S7 1500");
        button2.setBounds(15,location_y,150, 32);
        button2.setFocusPainted(false);
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setVisible(false);
                FormSiemensS7 form = new FormSiemensS7(SiemensPLCS.S1500);
                form.setVisible(true);
                form.dispose();
                setVisible(true);
            }
        });
        buttonPanel.add(button2);
        location_y+=40;

        JButton button3 = new JButton( "300");
        button3.setBounds(15,location_y,150, 32);
        button3.setFocusPainted(false);
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setVisible(false);
                FormSiemensS7 form = new FormSiemensS7(SiemensPLCS.S300);
                form.setVisible(true);
                form.dispose();
                setVisible(true);
            }
        });
        buttonPanel.add(button3);
        location_y+=40;

        JButton button4 = new JButton( "400");
        button4.setBounds(15,location_y,150, 32);
        button4.setFocusPainted(false);
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setVisible(false);
                FormSiemensS7 form = new FormSiemensS7(SiemensPLCS.S400);
                form.setVisible(true);
                form.dispose();
                setVisible(true);
            }
        });
        buttonPanel.add(button4);
        location_y+=40;

        JButton button5 = new JButton( "200 smart");
        button5.setBounds(15,location_y,150, 32);
        button5.setFocusPainted(false);
        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setVisible(false);
                FormSiemensS7 form = new FormSiemensS7(SiemensPLCS.S200Smart);
                form.setVisible(true);
                form.dispose();
                setVisible(true);
            }
        });
        buttonPanel.add(button5);
        location_y+=40;

        JButton button7 = new JButton( "200");
        button7.setBounds(15,location_y,150, 32);
        button7.setFocusPainted(false);
        button7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setVisible(false);
                FormSiemensS7 form = new FormSiemensS7(SiemensPLCS.S200);
                form.setVisible(true);
                form.dispose();
                setVisible(true);
            }
        });
        buttonPanel.add(button7);
        location_y+=40;

        JButton button6 = new JButton( "Fetch/Write");
        button6.setBounds(15,location_y,150, 32);
        button6.setFocusPainted(false);
        button6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setVisible(false);
                FormSiemensFW form = new FormSiemensFW();
                form.setVisible(true);
                form.dispose();
                setVisible(true);
            }
        });
        buttonPanel.add(button6);
        location_y+=40;

        panel.add(buttonPanel);
    }

    private void AddModbusGroup(JPanel panel){
        JPanel buttonPanel = new JPanel(null);
        buttonPanel.setBounds(395,5,183, 319);
        buttonPanel.setBorder(BorderFactory.createTitledBorder( "Modbus"));
        int location_y = 24;

        JButton button1 = new JButton( "Modbus Tcp");
        button1.setBounds(15,location_y,150, 32);
        button1.setFocusPainted(false);
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setVisible(false);
                FormModbusTcp form = new FormModbusTcp();
                form.setVisible(true);
                form.dispose();
                setVisible(true);
            }
        });
        buttonPanel.add(button1);
        location_y+=40;

        panel.add(buttonPanel);
    }

    private void AddOmronGroup(JPanel panel){
        JPanel buttonPanel = new JPanel(null);
        buttonPanel.setBounds(586,5,183, 319);
        buttonPanel.setBorder(BorderFactory.createTitledBorder( "Omron"));
        int location_y = 24;

        JButton button1 = new JButton( "Fins-Tcp");
        button1.setBounds(15,location_y,150, 32);
        button1.setFocusPainted(false);
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setVisible(false);
                FormOmronFins form = new FormOmronFins();
                form.setVisible(true);
                form.dispose();
                setVisible(true);
            }
        });
        buttonPanel.add(button1);
        location_y+=40;

        panel.add(buttonPanel);
    }

    private void AddKeyenceGroup(JPanel panel){
        JPanel buttonPanel = new JPanel(null);
        buttonPanel.setBounds(777,5,183, 319);
        buttonPanel.setBorder(BorderFactory.createTitledBorder( "Keyence"));
        int location_y = 24;

        JButton button1 = new JButton( "Mc 二进制");
        button1.setBounds(15,location_y,150, 32);
        button1.setFocusPainted(false);
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setVisible(false);
                FormKeyenceBinary form = new FormKeyenceBinary();
                form.setVisible(true);
                form.dispose();
                setVisible(true);
            }
        });
        buttonPanel.add(button1);
        location_y+=40;

        JButton button2 = new JButton( "Mc Ascii");
        button2.setBounds(15,location_y,150, 32);
        button2.setFocusPainted(false);
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setVisible(false);
                FormKeyenceAscii form = new FormKeyenceAscii();
                form.setVisible(true);
                form.dispose();
                setVisible(true);
            }
        });
        buttonPanel.add(button2);
        location_y+=40;

        panel.add(buttonPanel);
    }

    private void AddHslGroup(JPanel panel){
        JPanel buttonPanel = new JPanel(null);
        buttonPanel.setBounds(9,336,183, 315);
        buttonPanel.setBorder(BorderFactory.createTitledBorder( "Hsl"));
        int location_y = 24;

        JButton button1 = new JButton( "NetSimplify");
        button1.setBounds(15,location_y,150, 32);
        button1.setFocusPainted(false);
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setVisible(false);
                FormSimplifyNet form = new FormSimplifyNet();
                form.setVisible(true);
                form.dispose();
                setVisible(true);
            }
        });
        buttonPanel.add(button1);
        location_y+=40;

        JButton button2 = new JButton( "Net Push");
        button2.setBounds(15,location_y,150, 32);
        button2.setFocusPainted(false);
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setVisible(false);
                FormPushNet form = new FormPushNet();
                form.setVisible(true);
                form.dispose();
                setVisible(true);
            }
        });
        buttonPanel.add(button2);
        location_y+=40;


        panel.add(buttonPanel);
    }
}

