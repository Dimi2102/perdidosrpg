<p style="text-align: center;">
    <img src="https://lh3.googleusercontent.com/TU2QedwVIuNhie0s0wqCw95tr1pmtT-cXe-DaH0rYP9V9ia4DBNiFdEf3FWi4_0yC5mhRLRBQNENvZlSUc00MF_rbar6gLZY7DsY-9FXLroTvNZTSbaCKw302F61nPVxrZq4DzlHCzsnalGu2ZFcOtNS7N7l4NmfvynuUJdilMRQeBCIlOjIgg_GK8HG0ExNq5Zvx5iqevj_T2ThMccXY3LKf8Y8vPWFP3R4RtTYLLL5z3RxwqiCV6wu-g88r720xcRqhQrKGx4zxG4z21iBqgGkQcscdW4y_uVF7mROfHt44vJd2g3sOUSEz6z4cDM11Xh9rQAbshrO5I7yP4IuZxZhc2EYQX0Q7jFnsEGL_plYnFi46m74p-JRw_UBJZZE6CrRdRPfKNW42Ie_geOkysgsmgxQ99KrrGSr7w62M0_jWN00dRPavcx4bbtyGXAik-gr2V2_WTJK7lypfmRNp-8gg04fcFDZ-RQpxMsu-AgKv4l6ffbZy_LVelzMJE9nh21MoQFZ786VCM4WajjEjp9lxPB4dvO2_IBTco_zmfu5excWxCyuQjwGJQr7PI4Bl8bNUSqnbRrWspJv4GthNDyodirVrh3tHQ1JFcqZV42QLk-0C8d76ru20AEXaqWDd_krxRRFxX8liW9uBCqiSM7EhnNNjzLzYERWGm7I6zqYSX--O_xW7i4M4UibFA=w743-h254-no?authuser=0" style="width:50%;height:50%">
</p>

<form>
  <div class='sheet-col'>

  <h3>Nome:</h3>
  <input type="text" class= "sheet-nome" name="attr_nome" placeholder="Nome" style="width:800px" />
  <h3>Aparência: </h3>
  <input type="text" class= "sheet-aparencia" name="attr_aparencia" style="width:800px" placeholder="Aparência" />
  <h3>Motivação: </h3>
  <input type="text" class= "sheet-motivacao" name="attr_motivacao" style="width:800px" placeholder="Motivação" />
  <h3>Mácula: </h3>
  <input type="text" class= "sheet-macula" name="attr_macula" style="width:800px" placeholder="Macula" />


<p>&nbsp;</p>


<div class='sheet-col'>
  <h3>Atributos:</h3>
    Vigor <input type="number" name="attr_vig" class="atr" style="width:40px;height:30px"/>
    Discernimento <input type="number" name="attr_dis" class="atr" style="width:40px;height:30px"/>
    Empatia <input type="number" name="attr_em" class="atr" style="width:40px;height:30px"/>
    Charme <input type="number" name="attr_char" class="atr" style="width:40px;height:30px"/>
</div>

<p>&nbsp;</p>

<div class='sheet-3colrow'>
 <h3>Movimentos:</h3>
	<div class='sheet-col'>
	<h4>Ajudar ou interferir:</h4>
	<button type="roll" name="attr_comb" title='combcheck' value=" [[2d6 + ?{Atributo|0}]]"></button>
	<h4>Combater:</h4>
	<button type="roll" name="attr_comb" title='combcheck' value=" [[2d6 + @{Vigor}]]"></button>
	<h4>Contemplar os Olhos da Morte:</h4>
	<button type="roll" name="attr_comb" title='combcheck' value=" [[2d6]]"></button>
	 </div>
	 
<div class='sheet-col'> 
	<h4>Desafiar o Perigo:</h4>
	<button type="roll" name="attr_comb" title='combcheck' value=" [[2d6 + ?{Atributo|0}]]"></button>
	<h4>Desafiar o Perigo:</h4>
	<button type="roll" name="attr_comb" title='combcheck' value=" [[2d6 + ?{Atributo|0}]]"></button>
	<h4>Reconhecer os Sinais:</h4>
	<button type="roll" name="attr_comb" title='combcheck' value=" [[2d6 + @{Discernimento}]]"></button>
</div>

<div class='sheet-col'> 
	<h4>Negociar:</h4>
	<button type="roll" name="attr_comb" title='combcheck' value=" [[2d6 + @{Charme}]]"></button>
	<h4>Revelar o que Sabe:</h4>
	<button type="roll" name="attr_comb" title='combcheck' value=" [[2d6 + @{Empatia}]]"></button>
	<h4>Rolagem com V/D:</h4>
	<button type="roll" name="attr_comb" title='combcheck' value=" [[3d6 + ?{Modifier|0}]]"></button>
</div>

<p>&nbsp;</p>

<div class='sheet-10colrow'>
	<h3>Resquicios de Memória</h3>
	<input type="text" class= "sheet-resquicio1" name="attr_resquicio1" style="width:800px" placeholder="resquicio1" />
	<input type="text" class= "sheet-resquicio2" name="attr_resquicio1" style="width:800px" placeholder="resquicio2" />
	<input type="text" class= "sheet-resquicio3" name="attr_resquicio3" style="width:800px" placeholder="resquicio3" />
	<input type="text" class= "sheet-resquicio4" name="attr_resquicio4" style="width:800px" placeholder="resquicio4" />
	<input type="text" class= "sheet-resquicio5" name="attr_resquicio5" style="width:800px" placeholder="resquicio5" />
	<input type="text" class= "sheet-resquicio6" name="attr_resquicio6" style="width:800px" placeholder="resquicio6" />
	<input type="text" class= "sheet-resquicio7" name="attr_resquicio7" style="width:800px" placeholder="resquicio7" />
	<input type="text" class= "sheet-resquicio8" name="attr_resquicio8" style="width:800px" placeholder="resquicio8" />
	<input type="text" class= "sheet-resquicio9" name="attr_resquicio9" style="width:800px" placeholder="resquicio9" />
	<input type="text" class= "sheet-resquicio10" name="attr_resquicio10" style="width:800px" placeholder="resquicio10" />
</div>

<p>&nbsp;</p>


  <div class='sheet-2colrow'>
	<h3>Movimentos de Origem</h3>
	<input type="text" class= "sheet-movimento1" name="attr_resquicio1" style="width:800px" placeholder="resquicio1" />
	<input type="text" class= "sheet-movimento2" name="attr_resquicio1" style="width:800px" placeholder="resquicio2" />
</div>

<p>&nbsp;</p>


<div class='sheet-10colrow'>
  <h3>Ferimento:</h3>
			<div>
            <input type="checkbox" name="attr_injury1" class="checkboxInjury1">
				<input type="text" class= "sheet-descricao1" name="attr_descricao1" style="width:800px" placeholder="ferimento" />
				</div>
			<div>	
            <input type="checkbox" name="attr_injury2" class="checkboxInjury2">
				<input type="text" class= "sheet-descricao2" name="attr_descricao2" style="width:800px" placeholder="ferimento" />
			</div>	
			<input type="checkbox" name="attr_injury3" class="checkboxInjury3">
				<input type="text" class= "sheet-descricao3" name="attr_descricao3" style="width:800px" placeholder="ferimento" />
			<div>	
			<input type="checkbox" name="attr_injury4" class="checkboxInjury4">
				<input type="text" class= "sheet-descricao4" name="attr_descricao4" style="width:800px" placeholder="ferimento" />
			</div>	
			<input type="checkbox" name="attr_injury5" class="checkboxInjury5">
				<input type="text" class= "sheet-descricao5" name="attr_descricao5" style="width:800px" placeholder="ferimento" />	
			<div>	
			<input type="checkbox" name="attr_injury6" class="checkboxInjury6">
				<input type="text" class= "sheet-descricao6" name="attr_descricao6" style="width:800px" placeholder="ferimento" />	
			</div>	
			<input type="checkbox" name="attr_injury7" class="checkboxInjury7">
				<input type="text" class= "sheet-descricao7" name="attr_descricao7" style="width:800px" placeholder="ferimento" />	
			<div>	
			<input type="checkbox" name="attr_injury8" class="checkboxInjury8">
				<input type="text" class= "sheet-descricao8" name="attr_descricao8" style="width:800px" placeholder="ferimento" />	
			</div>	
			<input type="checkbox" name="attr_injury9" class="checkboxInjury9">
				<input type="text" class= "sheet-descricao9" name="attr_descricao9" style="width:800px" placeholder="ferimento" />
			<div>	
			<input type="checkbox" name="attr_injury10" class="checkboxInjury10">
				<input type="text" class= "sheet-descricao10" name="attr_descricao10" style="width:800px" placeholder="ferimento" />
			</div>		
</div>

<div class='sheet-colrow'>
  <div class='sheet-col'>
    <h3>Equipamento:</h3>
    <input type="text" name="Equipamento" placeholder="Equipamento" /><br />
    <textarea name="attr_Equipamento" placeholder="Descrição dos Equipamentos" rows="10" cols="40"></textarea><br />
  </div>

  
<p>&nbsp;</p>

<h3>Movimentos:</h3>
      <fieldset class="repeating_move" name="attr_move">            
        <input type="text" name="attr_move" placeholder="Nome do movimento"/> <br />   

        <span>Descrição do movimento:</span>
        <textarea name="attr_descmove" placeholder="Descrição do movimento" rows="10" cols="40"></textarea><br />
              <p>&nbsp;</p>
      </fieldset>
  <div>

</div>