package reborn.lifecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int yourLife;
    int opponentLife;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startGame();

        Button yPlus = (Button) findViewById(R.id.yourPlus);
        yPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yourLife++;
                atualizaPlacar();
            }
        });
        Button yLess = (Button) findViewById(R.id.yourLess);
        yLess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yourLife--;
                atualizaPlacar();
            }
        });
        Button oPluss = (Button) findViewById(R.id.opponentPlus);
        oPluss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opponentLife++;
                atualizaPlacar();
            }
        });
        Button oLess = (Button) findViewById(R.id.opponentLess);
        oLess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opponentLife--;
                atualizaPlacar();
            }
        });


        Button yPlus5 = (Button) findViewById(R.id.yourPlus5);
        yPlus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yourLife = yourLife + 5;
                atualizaPlacar();
            }
        });
        Button yLess5 = (Button) findViewById(R.id.yourLess5);
        yLess5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yourLife = yourLife - 5;
                atualizaPlacar();
            }
        });
        Button oPluss5 = (Button) findViewById(R.id.opponentPlus5);
        oPluss5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opponentLife =opponentLife +5 ;
                atualizaPlacar();
            }
        });
        Button oLess5 = (Button) findViewById(R.id.opponentLess5);
        oLess5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opponentLife =opponentLife -5 ;
                atualizaPlacar();
            }
        });

    }

    public void startGame(){
        yourLife = 20;
        opponentLife = 20;
        atualizaPlacar();
    }

    public void atualizaPlacar() {
        TextView yLife = (TextView)findViewById(R.id.yourLife);
        TextView oLife = (TextView)findViewById(R.id.opponentLife);
        yLife.setText(String.valueOf(yourLife));
        oLife.setText(String.valueOf(opponentLife));
    }
}
