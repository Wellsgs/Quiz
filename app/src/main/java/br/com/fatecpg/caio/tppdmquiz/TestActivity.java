package br.com.fatecpg.caio.tppdmquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestActivity extends AppCompatActivity {
    private ArrayList<Question> questions = new ArrayList<>();
    private ArrayList <Question> quiz = new ArrayList<>();
    private ArrayList<String> answers = new ArrayList<>();
    private int position = 0;
    public int qtq = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        qtq = getIntent().getIntExtra("qtq", 1);

        System.out.println(qtq);

        createTest();
        clearAnswers();
        refreshQuestion();
        buttonVisible();
    }

    private void createTest(){


        //1
        Question q = new Question();

        q.question = "Analise as seguintes frases e assinale a alternativa correta: I. Conjunto de programas. II. Usuários ou profissionais em TI. III. Parte física do computador.";
        q.answer = "I- Software, II- Peopleware, III- Hardware.";
        q.options = new String[]{   "I- Hardware, II- Software, III- Firmware.",
                                    "I- Software, II- Firmware, III- Hardware.",
                                    "I- Software, II- Peopleware, III- Hardware.",
                                    "I- Software, II- Tupperware, III- Firmware.",
                                };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);

        //2
        q = new Question();
        q.question = "Uma empresa possui duas filiais em São Paulo. A primeira filial possui 4 agências próximas e a segunda filial possui 2 agências próximas uma das outras. O dono da empresa quer fazer uma rede interligando os computadores de cada filial e outra rede para interligar as duas filiais. Qual é o tipo de rede que ele deve usar para interligar, respectivamente, os computadores de cada filial e outra para interligar as filiais?";
        q.answer = "Rede LAN - Rede MAN.";
        q.options = new String[]{   "Rede WAN - Rede LAN.",
                                    "Rede MAN - Rede WAN.",
                                    "Rede LAN - Rede MAN.",
                                    "Rede MAN - Rede LAN."
                                };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);

        //3
        q = new Question();
        q.question = "Se um profissional está criando um site em HTML e ele quiser colocar uma barra horizontal em sua página, qual tag ele deve usar?";
        q.answer = "<hr/>";
        q.options = new String[]{   "<hr/>",
                "<br/>",
                "<hr></hr>",
                "<br></br>"
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);

        //4
        q = new Question();
        q.question = "Todas as afirmações abaixo são verdadeiras, exceto:";
        q.answer = "No diagrama de blocos, o retângulo não representa a entrada de dados.";
        q.options = new String[]{   "O diagrama de blocos é formado apenas por figuras geométricas.",
                "O círculo no diagrama de blocos representa um conector.",
                "O losângo, no diagrama de blocos, representa decisão.",
                "No diagrama de blocos, o retângulo não representa a entrada de dados."
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);

        //5
        q = new Question();
        q.question = "Assinale a alternativa que não contem uma propriedade de Visual Basic.";
        q.answer = "Label.";
        q.options = new String[]{   "Name.",
                "Label.",
                "Text.",
                "BackColor."
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);


        //6
        q = new Question();
        q.question = "HTML é uma linguagem de:";
        q.answer = "Formatação.";
        q.options = new String[]{   "Programação.",
                "Formatação.",
                "Visualização.",
                "Programação de web."
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);


        //7
        q = new Question();
        q.question = "Qual das seguintes variáveis só aceita números inteiros?";
        q.answer = "Long.";
        q.options = new String[]{   "Long.",
                "String.",
                "Interger.",
                "Double."
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);


        //8
        q = new Question();
        q.question = "Assinale a alternativa que não contém uma regra para nomeação de variáveis.";
        q.answer = "Não podem ter números.";
        q.options = new String[]{   "Não pode ser palavra reservada.",
                "Os espaços devem ser dados por underline.",
                "Não pode haver espaço.",
                "Não podem ter números."
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);


        //9
        q = new Question();
        q.question = "Qual é a diferença de RAM e ROM?";
        q.answer = "RAM é volátil, ROM é não-volátil.";
        q.options = new String[]{   "RAM é volátil, ROM é não-volátil.",
                "RAM não é volátil, ROM é volátil.",
                "ROM armazena mais memória.",
                "Nenhuma das alternativas está correta."
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);


        //10
        q = new Question();
        q.question = "Um programador está criando um programa que calcula o valor de delta numa equação de segundo grau. Como ele programaria isso em linguagem de programação do Visual Basic?";
        q.answer = "d = b^2 - 4*a*c";
        q.options = new String[]{   "d = b² - 4.a.c",
                "d = b^2 + 4.a.c",
                "d = b^2 - 4*a*c",
                "d = b² - 4*a*c"
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);


        //11
        q = new Question();
        q.question = "O que é Informática?";
        q.answer = "É o termo usado para se descrever o conjunto das ciências da informação";
        q.options = new String[]{   "É uma comida deliciosa",
                "É o termo usado para se descrever o conjunto das ciências da informação",
                "Um Vídeo Game Antigo",
                "Uma Máquina para criação de papel",
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);

        //12
        q = new Question();
        q.question = "Qual o Conceito da palavra INFORMÁTICA?";
        q.answer = "A palavra Informática é derivada de duas outras palavras associadas a ela, a primeira é informação e a segunda é automática.";
        q.options = new String[]{   "A palavra Informática é derivada de duas outras palavras associadas a ela, a primeira é informação e a segunda é automática.",
                "Criar e Editar imagens.",
                "Avaliar e observar diversos formatos de arquivo.",
                "De uma peça de televisão."
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);


        //13
        q = new Question();
        q.question = "Qual o significado do arquivo .EXE?";
        q.answer = "Arquivo Executável";
        q.options = new String[]{   "Arquivo Extraível",
                "Arquivo de Vídeo",
                "Arquivo de Áudio",
                "Arquivo Executável"
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);

        //14
        q = new Question();
        q.question = "Qual desses softwares é necessário para a proteção do compuador?";
        q.answer = "Antivírus";
        q.options = new String[]{   "Sistema operacional",
                "Gta San Andreas",
                "Antivírus",
                "Nero"
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);

        //15
        q = new Question();
        q.question = "Dos abaixo, quais são chamados de Sistema Operacional?";
        q.answer = "Windows, Mac OS X e Linux";
        q.options = new String[]{   "Windows, Mac OS X e Linux",
                "Photoshop, Flash e Adobe Premiere",
                "Camtasia e Sony Vegas",
                "Pivot e Image Ready"
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);

        //16
        q = new Question();
        q.question = "Qual desses acessórios é necessário para Digitar?";
        q.answer = "teclado";
        q.options = new String[]{   "Mouse",
                "CPU",
                "Monitor",
                "teclado"
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);

        //17
        q = new Question();
        q.question = "Qual o navegador que vem embutido com o Windows 7?";
        q.answer = "Internet Explorer";
        q.options = new String[]{   "Safari",
                "Internet Explorer",
                "Mozilla Firefox",
                "Goolge Chrome"
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);

        //18
        q = new Question();
        q.question = "Qual desses nomes pertence ao Fundador da Microsoft?";
        q.answer = "Bill Gates";
        q.options = new String[]{   "Bill Gates",
                "Michael Jackson",
                "Ricardo Pupo",
                "Rodrigo Salgado"
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);

        //19
        q = new Question();
        q.question = "Qual o buscador mais famoso da Web?";
        q.answer = "Google";
        q.options = new String[]{   "Bing",
                "Yahoo",
                "Google",
                "Blogspot"
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);

        //20
        q = new Question();
        q.question = "Qual a Ferramenta do Google usada para assistir Vídeos?";
        q.answer = "Youtube";
        q.options = new String[]{   "G-mail",
                "Orkut",
                "Picasa",
                "Youtube"
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);

        //21
        q = new Question();
        q.question = "Uma empresa possui duas filiais em São Paulo. A primeira filial possui 4 agências próximas e a segunda filial possui 2 agências próximas uma das outras. O dono da empresa quer fazer uma rede interligando os computadores de cada filial e outra rede para interligar as duas filiais. Qual é o tipo de rede que ele deve usar para interligar, respectivamente, os computadores de cada filial e outra para interligar as filiais?";
        q.answer = "I- Software, II- Peopleware, III- Hardware.";
        q.options = new String[]{   "Rede WAN - Rede LAN.",
                "Rede MAN - Rede WAN.",
                "Rede LAN - Rede WAN.",
                "Rede MAN - Rede LAN.",
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);

        //22
        q = new Question();
        q.question = "Uma empresa possui duas filiais em São Paulo. A primeira filial possui 4 agências próximas e a segunda filial possui 2 agências próximas uma das outras. O dono da empresa quer fazer uma rede interligando os computadores de cada filial e outra rede para interligar as duas filiais. Qual é o tipo de rede que ele deve usar para interligar, respectivamente, os computadores de cada filial e outra para interligar as filiais?";
        q.answer = "I- Software, II- Peopleware, III- Hardware.";
        q.options = new String[]{   "Rede WAN - Rede LAN.",
                "Rede MAN - Rede WAN.",
                "Rede LAN - Rede WAN.",
                "Rede MAN - Rede LAN.",
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);

        //23
        q = new Question();
        q.question = "Uma empresa possui duas filiais em São Paulo. A primeira filial possui 4 agências próximas e a segunda filial possui 2 agências próximas uma das outras. O dono da empresa quer fazer uma rede interligando os computadores de cada filial e outra rede para interligar as duas filiais. Qual é o tipo de rede que ele deve usar para interligar, respectivamente, os computadores de cada filial e outra para interligar as filiais?";
        q.answer = "I- Software, II- Peopleware, III- Hardware.";
        q.options = new String[]{   "Rede WAN - Rede LAN.",
                "Rede MAN - Rede WAN.",
                "Rede LAN - Rede WAN.",
                "Rede MAN - Rede LAN.",
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);

        //24
        q = new Question();
        q.question = "Uma empresa possui duas filiais em São Paulo. A primeira filial possui 4 agências próximas e a segunda filial possui 2 agências próximas uma das outras. O dono da empresa quer fazer uma rede interligando os computadores de cada filial e outra rede para interligar as duas filiais. Qual é o tipo de rede que ele deve usar para interligar, respectivamente, os computadores de cada filial e outra para interligar as filiais?";
        q.answer = "I- Software, II- Peopleware, III- Hardware.";
        q.options = new String[]{   "Rede WAN - Rede LAN.",
                "Rede MAN - Rede WAN.",
                "Rede LAN - Rede WAN.",
                "Rede MAN - Rede LAN.",
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);

        //25
        q = new Question();
        q.question = "Uma empresa possui duas filiais em São Paulo. A primeira filial possui 4 agências próximas e a segunda filial possui 2 agências próximas uma das outras. O dono da empresa quer fazer uma rede interligando os computadores de cada filial e outra rede para interligar as duas filiais. Qual é o tipo de rede que ele deve usar para interligar, respectivamente, os computadores de cada filial e outra para interligar as filiais?";
        q.answer = "I- Software, II- Peopleware, III- Hardware.";
        q.options = new String[]{   "Rede WAN - Rede LAN.",
                "Rede MAN - Rede WAN.",
                "Rede LAN - Rede WAN.",
                "Rede MAN - Rede LAN.",
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);

        //26
        q = new Question();
        q.question = "Uma empresa possui duas filiais em São Paulo. A primeira filial possui 4 agências próximas e a segunda filial possui 2 agências próximas uma das outras. O dono da empresa quer fazer uma rede interligando os computadores de cada filial e outra rede para interligar as duas filiais. Qual é o tipo de rede que ele deve usar para interligar, respectivamente, os computadores de cada filial e outra para interligar as filiais?";
        q.answer = "I- Software, II- Peopleware, III- Hardware.";
        q.options = new String[]{   "Rede WAN - Rede LAN.",
                "Rede MAN - Rede WAN.",
                "Rede LAN - Rede WAN.",
                "Rede MAN - Rede LAN.",
        };

        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);

        //27
        q = new Question();
        q.question = "Uma empresa possui duas filiais em São Paulo. A primeira filial possui 4 agências próximas e a segunda filial possui 2 agências próximas uma das outras. O dono da empresa quer fazer uma rede interligando os computadores de cada filial e outra rede para interligar as duas filiais. Qual é o tipo de rede que ele deve usar para interligar, respectivamente, os computadores de cada filial e outra para interligar as filiais?";
        q.answer = "I- Software, II- Peopleware, III- Hardware.";
        q.options = new String[]{   "Rede WAN - Rede LAN.",
                "Rede MAN - Rede WAN.",
                "Rede LAN - Rede WAN.",
                "Rede MAN - Rede LAN.",
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);

        //28
        q = new Question();
        q.question = "Uma empresa possui duas filiais em São Paulo. A primeira filial possui 4 agências próximas e a segunda filial possui 2 agências próximas uma das outras. O dono da empresa quer fazer uma rede interligando os computadores de cada filial e outra rede para interligar as duas filiais. Qual é o tipo de rede que ele deve usar para interligar, respectivamente, os computadores de cada filial e outra para interligar as filiais?";
        q.answer = "I- Software, II- Peopleware, III- Hardware.";
        q.options = new String[]{   "Rede WAN - Rede LAN.",
                "Rede MAN - Rede WAN.",
                "Rede LAN - Rede WAN.",
                "Rede MAN - Rede LAN.",
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);

        //29
        q = new Question();
        q.question = "Uma empresa possui duas filiais em São Paulo. A primeira filial possui 4 agências próximas e a segunda filial possui 2 agências próximas uma das outras. O dono da empresa quer fazer uma rede interligando os computadores de cada filial e outra rede para interligar as duas filiais. Qual é o tipo de rede que ele deve usar para interligar, respectivamente, os computadores de cada filial e outra para interligar as filiais?";
        q.answer = "I- Software, II- Peopleware, III- Hardware.";
        q.options = new String[]{   "Rede WAN - Rede LAN.",
                "Rede MAN - Rede WAN.",
                "Rede LAN - Rede WAN.",
                "Rede MAN - Rede LAN.",
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);

        //30
        q = new Question();
        q.question = "Uma empresa possui duas filiais em São Paulo. A primeira filial possui 4 agências próximas e a segunda filial possui 2 agências próximas uma das outras. O dono da empresa quer fazer uma rede interligando os computadores de cada filial e outra rede para interligar as duas filiais. Qual é o tipo de rede que ele deve usar para interligar, respectivamente, os computadores de cada filial e outra para interligar as filiais?";
        q.answer = "I- Software, II- Peopleware, III- Hardware.";
        q.options = new String[]{   "Rede WAN - Rede LAN.",
                "Rede MAN - Rede WAN.",
                "Rede LAN - Rede WAN.",
                "Rede MAN - Rede LAN.",
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);

        //30
        q = new Question();
        q.question = "Uma empresa possui duas filiais em São Paulo. A primeira filial possui 4 agências próximas e a segunda filial possui 2 agências próximas uma das outras. O dono da empresa quer fazer uma rede interligando os computadores de cada filial e outra rede para interligar as duas filiais. Qual é o tipo de rede que ele deve usar para interligar, respectivamente, os computadores de cada filial e outra para interligar as filiais?";
        q.answer = "I- Software, II- Peopleware, III- Hardware.";
        q.options = new String[]{   "Rede WAN - Rede LAN.",
                "Rede MAN - Rede WAN.",
                "Rede LAN - Rede WAN.",
                "Rede MAN - Rede LAN.",
        };
        Collections.shuffle(Arrays.asList(q.options));
        questions.add(q);

        Collections.shuffle(questions);


        for (int i = 1; i <= qtq; i++){
            quiz.add(questions.get(i));
        }

    }

    private void clearAnswers(){
        for(Question question: quiz){
            answers.add("");
        }
    }

    private void refreshQuestion(){
        Question q = quiz.get(position);

        TextView posTextView = (TextView) findViewById(R.id.positionTextView);
        posTextView.setText((position+1)+" de " + qtq);

        TextView qTextView = (TextView) findViewById(R.id.questionTextView);
        qTextView.setText(q.question);

        RadioButton opt1 = (RadioButton) findViewById(R.id.option1Radio);
        opt1.setText(q.options[0]);

        RadioButton opt2 = (RadioButton) findViewById(R.id.option2Radio);
        opt2.setText(q.options[1]);

        RadioButton opt3 = (RadioButton) findViewById(R.id.option3Radio);
        opt3.setText(q.options[2]);

        RadioButton opt4 = (RadioButton) findViewById(R.id.option4Radio);
        opt4.setText(q.options[3]);

        RadioGroup group = (RadioGroup)findViewById(R.id.optionGroup);
        group.check(0);

        if(answers.get(position).equals(opt1.getText()))
            group.check(R.id.option1Radio);
        else if(answers.get(position).equals(opt2.getText()))
            group.check(R.id.option2Radio);
        else if(answers.get(position).equals(opt3.getText()))
            group.check(R.id.option3Radio);
        else if(answers.get(position).equals(opt4.getText()))
            group.check(R.id.option4Radio);

    }

    public void back(View view){
        if(position > 0){
            position--;
            refreshQuestion();
        }

        buttonVisible();
    }

    public void next(){
        if(position < quiz.size()-1){
            position++;
            refreshQuestion();
        }
        else if(position == quiz.size()-1){
            Button btn = (Button) findViewById(R.id.btnFinish);
            btn.setVisibility(View.VISIBLE);
        }

        buttonVisible();

    }

    public void optionSelection(View view){
        RadioButton opt = (RadioButton)findViewById(view.getId());
        answers.set(position, opt.getText().toString());
        next();
    }

    public void finish(View view){
        int sum = 0;
        for(int i=0; i<quiz.size(); i++){
            if(quiz.get(i).answer.equals(answers.get(i))){
                sum++;
            }
        }
        double result = 100.0 * (double)sum / (double)quiz.size();

        Intent i = new Intent(getApplicationContext(), ResultActivity.class);
        i.putExtra("result", result);

        startActivity(i);

        finish();
    }

    public void buttonVisible(){

        Button anteriorBtn = (Button) findViewById(R.id.anteriorButton);
        if(position == 0){
            anteriorBtn.setVisibility(View.GONE);
        }else{
            anteriorBtn.setVisibility(View.VISIBLE);
        }

    }

}