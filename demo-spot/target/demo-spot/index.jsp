


<html>

    <style>
    body {
        background-color:rgb(0, 0, 0);
        font-family: sans-serif;
        font-size:x-large;
        text-align: center;

        
      }
    .form-center {
        display: inline-block;
        width: 600px;
        border: 15px solid rgb(255, 168, 252);
        padding: 50px;
        margin: 20px;
        background-color: rgb(235, 179, 240);
        } 
    h1{
        text-align: right;
        font-size: 14px;
        color: whitesmoke;
        }
        
    
      
    </style>

    <title>Inicio de Sesion Spotfix</title>
    
    <h1><a href="Pagina Principal.html" style="color: white;">Registrarse</a></h1>
    
    
    
    <body>
    
    
    <img src="spotfix.png" alt="spotfix.com" style="width:auto; display: block; margin-left: auto; margin-right: auto;">
    
    <div class="form-center">
      <form action="hello"><!-- Agregar la accion -->
        <label for="genero1">Elegir el primer genero:</label>
        <select name="genero1" id="genero1" required>
          <option value="">None</option>
          <option value="pop">pop</option>
          <option value="disco">disco</option>
          <option value="soul">soul</option>
          <option value="rock">rock</option>
          <option value="soft rock">soft rock</option>
          <option value="hard rock">hard rock</option>
          <option value="metal">metal</option>
          <option value="funk">funk</option>
          <option value="hip hop">hip hop</option>
          <option value="rap">rap</option>
          <option value="boy band">boy band</option>
          <option value="latin pop">latin pop</option>
          <option value="latin">latin</option>
          <option value="reggaeton">reggaeton</option>
          <option value="k-pop">k-pop</option>
        </select>
  <!-- Genero2 -->
        <br><br>
        <label for="genero2">Elegir el segundo genero:</label>
        <select name="genero2" id="genero2">
          <option value="">None</option>
          <option value="pop">pop</option>
          <option value="disco">disco</option>
          <option value="soul">soul</option>
          <option value="rock">rock</option>
          <option value="soft rock">soft rock</option>
          <option value="hard rock">hard rock</option>
          <option value="metal">metal</option>
          <option value="funk">funk</option>
          <option value="hip hop">hip hop</option>
          <option value="rap">rap</option>
          <option value="boy band">boy band</option>
          <option value="latin pop">latin pop</option>
          <option value="latin">latin</option>
          <option value="reggaeton">reggaeton</option>
          <option value="k-pop">k-pop</option>
        </select>
        <!-- Genero3 -->
        <br><br>
        <label for="genero3">Elegir el tercer genero:</label>
        <select name="genero3" id="genero3">
          <option value="">None</option>
          <option value="pop">pop</option>
          <option value="disco">disco</option>
          <option value="soul">soul</option>
          <option value="rock">rock</option>
          <option value="soft rock">soft rock</option>
          <option value="hard rock">hard rock</option>
          <option value="metal">metal</option>
          <option value="funk">funk</option>
          <option value="hip hop">hip hop</option>
          <option value="rap">rap</option>
          <option value="boy band">boy band</option>
          <option value="latin pop">latin pop</option>
          <option value="latin">latin</option>
          <option value="reggaeton">reggaeton</option>
          <option value="k-pop">k-pop</option>
        </select>

         <!-- Agregar o eliminar artista (opcional) -->
         <p>Agrega o Eliminar<p>
         <label for="fname">Artista a Agregar o a Eliminar</label>
        <input type="text" id="fname" name="fname"><br><br>
        <input type="checkbox" id="agregar" name="agregar" value="agregar">
        <label for="agregar"> Agregar al artista</label><br>
        <input type="checkbox" id="eliminar" name="eliminar" value="eliminar">
        <label for="eliminar">Eliminar al artista</label><br>
        <br>
        <input type="submit" value="Submit">
      </form>
    </div>
  
    </body>
    
    </html>