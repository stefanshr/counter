import logo from './logo.svg';
import './App.css';
import React, {useEffect, useState} from "react";
import axios from "axios";

function useForceUpdate() {
    let [value, setState] = useState(true);
    return () => setState(!value);
}

let amount;
export default function App() {
    let forceUpdate = useForceUpdate();

    async function load() {
        const result = await axios.get('/api/getAmount');
        amount = result.data
        forceUpdate()
    }


    window.onload = function () {
        load()
    };

    return (
            <div className="App">
                <header className="App-header">
                    <h1>This page was viewed this many times:</h1>
                    <h2>{amount}</h2>
                </header>
            </div>
    );
}
