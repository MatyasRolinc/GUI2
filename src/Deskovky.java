import javax.swing.*;

public class Deskovky extends JFrame {
    private JTextField textField1;
    private JPanel window;
    private JRadioButton radioGood;
    private JRadioButton radioMid;
    private JRadioButton radioTrash;
    private JRadioButton radioBuy;
    private JButton buttonPrevious;
    private JButton buttonSave;
    private JButton buttonNext;
    private JLabel labelName;
    private int indexAktualniDeskovky = 0;
    private SpravceDeskovek spravceDeskovek;

    private void zapisUdajeAktualniDeskovkyDoOkna()
    {


        Deskovka aktualniDeskovka = spravceDeskovek.getPocetDeskovek(indexAktualniDeskovky);
        labelName.setText(aktualniDeskovka.getNazevHry());
        radioBuy.setSelected(aktualniDeskovka.isMamKoupenou());
        switch (aktualniDeskovka.getOblibenost())
        {
            case 1:
                radioGood.setSelected(true);
                break;
            case 2:
                radioMid.setSelected(true);
                break;
            case 3:
                 radioTrash.setSelected(true);
                break;
        }
    }


    public Deskovky(SpravceDeskovek spravceDeskovek)
    {
        setTitle("Deskovky");
        setContentPane(window);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        zapisUdajeAktualniDeskovkyDoOkna();
        buttonPrevious.addActionListener(e -> {
            if (indexAktualniDeskovky < spravceDeskovek.getPocetDeskovek() - 1){
                indexAktualniDeskovky++;
                zapisUdajeAktualniDeskovkyDoOkna();
            }
        {
            labelName.setText("");
            radioBuy.setSelected(false);
            radioMid.setSelected(true);
        }});



    }
}
