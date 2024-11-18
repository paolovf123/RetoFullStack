import './App.css';
import React from 'react';
import { useFetch } from './useFetch';
function App(){
    const ApiBuses = "http://localhost:8080/buses";
    const ApiMarcas = "http://localhost:8080/marcas"

    const {buses,loading} = useFetch(ApiBuses);
    return (
        <div className='App'>
            <h1 className='title'>Buses extraidos de nuestra Api</h1>
            <div className='card'>
                <ul>
                    {loading&&<li>Cargando...!</li>}
                    {buses?.map((bus)=>(
                        <li key={bus.busId}>
                            <div className='infoPrincipal'>
                                <img className='logoCiva' src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQdSBlqvYcVlbSbZAJUmak700tFH9AOIQXwUQ&s'></img>
                                <div className='marcaBus'>
                                    <p>Marca:</p>
                                    {bus.marca.marcaBus}
                                </div>
                                <div className='placaBus'>
                                    <p>Placa:</p>
                                    {bus.placa}
                                    </div>
                                <div className='numeroBus'>
                                    <p>Número de bus:</p>
                                    {bus.numeroBus}
                                    </div>
                                {bus.activo && <p>Estado: Activo</p>}
                                {!bus.activo &&<p>Estado: Inactivo</p>}
                            </div>
                            <div className='caracteristicasBus'>
                                <p>Caracteristicas:</p>
                                <p>{bus.caracteristicas}</p>
                            </div>
                        </li>
                    ))}
                </ul>
            </div>
        </div>
    );
}

export default App;