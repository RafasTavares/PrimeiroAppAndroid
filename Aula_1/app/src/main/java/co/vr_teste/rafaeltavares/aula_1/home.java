package co.vr_teste.rafaeltavares.aula_1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //Cria o botão pelo id do butao que eu quero
        final Button button = (Button) findViewById(R.id.Navagacao);
        //seta o click do botão corrente
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(this.ClasseTela2.class);
                // intent.putExtra("NomeMensagem", "Minha Mensagem");
                //startActivity(intent);
                // ---- OU -----
                //inicia o intent e pass a nova pasta
                startActivity(new Intent(getApplicationContext(), Grid_View.class));
                //finalizda a actinity atual antes de iniciar a proxima
                finish();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        //Inicia uma constante do tipo Toast passando (minha activity, um texto a ser exibido, e a duraçãode exibição)
        //e para exibir eu insiro o show() para mostrar
        Toast.makeText(home.this, " método on back pressed" , Toast.LENGTH_LONG).show();
        super.onBackPressed();
    }
}
