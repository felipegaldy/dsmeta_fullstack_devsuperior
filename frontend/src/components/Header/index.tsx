import React from "react";
import './style.css'
import logo from '../../assets/img/logo.svg'
export default function Header() {
  return (
    <header>
      <div className="dsmeta-logo-container">
        <img src={logo} alt="DSMeta" />
        <h1>DSMeta</h1>
        <p>
          Desenvolvido por 
          <a href="https://github.com/felipegaldy"> @felipegaldy</a>
        </p>
      </div>
    </header>
  );
}
