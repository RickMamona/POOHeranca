package com.example.pooheranca;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    TextView txtNome;
    TextView txtAdmissao;
    TextView txtSalario;
    TextView txtComissao;
    TextView txtTotalFuncio;
    TextView txtDataNascimento;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        iniciarComponetesLayout();

        criarObjeto();



    }

    private void criarObjeto() {
        Funcionario rick = new Funcionario();
        Gerente gerenteRuan = new Gerente();

        gerenteRuan.setNome("Ruan");
        gerenteRuan.setDataAdmissao("02/02/2024");
        gerenteRuan.setSalario(3000.85);
        gerenteRuan.setComissao(15);
        gerenteRuan.setTotalFuncionario(10);
        gerenteRuan.setDataNascimento("02/02/1991");



        txtNome.setText(gerenteRuan.getNome());
        txtAdmissao.setText(gerenteRuan.getDataAdmissao());
        txtSalario.setText("R$"+ gerenteRuan.getSalario()+"");
        txtComissao.setText(gerenteRuan.getComissao()+"%");
        txtTotalFuncio.setText(gerenteRuan.getTotalFuncionario()+"");
        txtDataNascimento.setText(gerenteRuan.getDataNascimento());


    }

    private void iniciarComponetesLayout() {

        txtNome =findViewById(R.id.txtNome);
        txtAdmissao =findViewById(R.id.txtAdmissao);
        txtSalario =findViewById(R.id.txtSalario);
        txtComissao =findViewById(R.id.txtComissao);
        txtTotalFuncio =findViewById(R.id.txtTotalFuncio);
        txtDataNascimento =findViewById(R.id.txtDataNascimento);





    }
}