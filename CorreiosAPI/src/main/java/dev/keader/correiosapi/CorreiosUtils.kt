package dev.keader.correiosapi

class CorreiosUtils {
    companion object {
        val Types = mapOf(
            "AA" to "etiqueta l\u00F3gica sedex",
            "AB" to "etiqueta l\u00F3gica sedex",
            "AL" to "agentes de leitura",
            "AR" to "aviso de recebimento",
            "AS" to "encomenda pac - acao social",
            "BE" to "remessa econ\u00F4mica s/ ar digital",
            "BF" to "remessa expressa s/ ar digital",
            "BG" to "etiqueta log rem econ c/ar bg",
            "BH" to "mensagem f\u00EDsico-digital",
            "BI" to "etiqueta l\u00F3g regist urg",
            "CA" to "objeto internacional colis",
            "CB" to "objeto internacional colis",
            "CC" to "objeto internacional colis",
            "CD" to "objeto internacional colis",
            "CE" to "objeto internacional colis",
            "CF" to "objeto internacional colis",
            "CG" to "objeto internacional colis",
            "CH" to "objeto internacional colis",
            "CI" to "objeto internacional colis",
            "CJ" to "objeto internacional colis",
            "CK" to "objeto internacional colis",
            "CL" to "objeto internacional colis",
            "CM" to "objeto internacional colis",
            "CN" to "objeto internacional colis",
            "CO" to "objeto internacional colis",
            "CP" to "objeto internacional colis",
            "CQ" to "objeto internacional colis",
            "CR" to "objeto internacional colis",
            "CS" to "objeto internacional colis",
            "CT" to "objeto internacional colis",
            "CU" to "objeto internacional colis",
            "CV" to "objeto internacional colis",
            "CW" to "objeto internacional colis",
            "CX" to "objeto internacional colis",
            "CY" to "objeto internacional colis",
            "CZ" to "objeto internacional colis",
            "DA" to "encomenda sedex c/ ar digital",
            "DB" to "remessa expressa c/ ar digital-bradesco",
            "DC" to "remessa expressa (orgao transito)",
            "DD" to "devolu\u00E7\u00E3o de documentos",
            "DE" to "remessa expressa c/ ar digital",
            "DF" to "encomenda sedex (etiq logica)",
            "DG" to "encomenda sedex (etiq logica)",
            "DI" to "rem expres com ar digital itau",
            "DJ" to "encomenda sedex",
            "DK" to "sedex extra grande",
            "DL" to "sedex l\u00F3gico",
            "DM" to "encomenda sedex",
            "DN" to "encomenda sedex",
            "DO" to "rem expres com ar digital itau unibanco",
            "DP" to "sedex pagamento entrega",
            "DQ" to "rem expres com ar digital bradesco",
            "DR" to "rem expres com ar digital santander",
            "DS" to "rem expres com ar digital santander",
            "DT" to "remessa econ.seg.transito c/ar digital",
            "DU" to "encomenda sedex",
            "DV" to "sedex com ar digital",
            "DW" to "encomenda sedex (etiq l\u00F3gica)",
            "DX" to "sedex 10 l\u00F3gico",
            "DY" to "encomenda sedex (etiq f\u00EDsica)",
            "DZ" to "encomenda sedex (etiq logica)",
            "EA" to "objeto internacional ems",
            "EB" to "objeto internacional ems",
            "EC" to "encomenda pac",
            "ED" to "objeto internacional packet express",
            "EE" to "objeto internacional ems",
            "EF" to "objeto internacional ems",
            "EG" to "objeto internacional ems",
            "EH" to "objeto internacional ems",
            "EI" to "objeto internacional ems",
            "EJ" to "objeto internacional ems",
            "EK" to "objeto internacional ems",
            "EL" to "objeto internacional ems",
            "EM" to "sedex mundi",
            "EN" to "objeto internacional ems",
            "EO" to "objeto internacional ems",
            "EP" to "objeto internacional ems",
            "EQ" to "encomenda servi\u00E7o n\u00E3o expressa ect",
            "ER" to "registrado",
            "ES" to "objeto internacional ems",
            "ET" to "objeto internacional ems",
            "EU" to "objeto internacional ems",
            "EV" to "objeto internacional ems",
            "EW" to "objeto internacional ems",
            "EX" to "objeto internacional ems",
            "EY" to "objeto internacional ems",
            "EZ" to "objeto internacional ems",
            "FA" to "fac registrado",
            "FB" to "fac registrado",
            "FC" to "fac registrado (5 dias)",
            "FD" to "fac registrado (10 dias)",
            "FE" to "encomenda fnde",
            "FF" to "registrado detran",
            "FH" to "fac registrado c/ ar digital",
            "FJ" to "remessa econ\u00F4mica c/ ar digital",
            "FM" to "fac registrado (monitorado)",
            "FR" to "fac registrado",
            "IA" to "integrada avulsa",
            "IC" to "integrada a cobrar",
            "ID" to "integrada devolucao de documento",
            "IE" to "integrada especial",
            "IF" to "cpf",
            "II" to "integrada interno",
            "IK" to "integrada com coleta simultanea",
            "IM" to "integrada medicamentos",
            "IN" to "obj de corresp e ems rec exterior",
            "IP" to "integrada programada",
            "IR" to "impresso registrado",
            "IS" to "integrada standard",
            "IT" to "integrada termol\u00E1bil",
            "IU" to "integrada urgente",
            "IX" to "edei encomenda expressa",
            "JA" to "remessa economica c/ar digital",
            "JB" to "remessa economica c/ar digital",
            "JC" to "remessa economica c/ar digital",
            "JD" to "remessa economica s/ar digital",
            "JE" to "remessa economica c/ar digital",
            "JF" to "remessa economica c/ar digital",
            "JG" to "registrado priorit\u00E1rio",
            "JH" to "registrado priorit\u00E1rio",
            "JI" to "remessa economica s/ar digital",
            "JJ" to "registrado justi\u00E7a",
            "JK" to "remessa econ\u00F4mica s/ar digital",
            "JL" to "registrado l\u00F3gico",
            "JM" to "mala direta postal especial",
            "JN" to "mala direta postal especial",
            "JO" to "registrado priorit\u00E1rio",
            "JP" to "objeto receita federal (exclusivo)",
            "JQ" to "remessa economica c/ar digital",
            "JR" to "registrado priorit\u00E1rio",
            "JS" to "registrado l\u00F3gico",
            "JT" to "registrado urgente",
            "JU" to "etiqueta f\u00EDs regist urg",
            "JV" to "remessa econ\u00F4mica c/ar digital",
            "JW" to "carta comercial a faturar (5 dias)",
            "JX" to "carta comercial a faturar (10 dias)",
            "JY" to "remessa economica (5 dias)",
            "JZ" to "remessa economica (10 dias)",
            "LA" to "log\u00EDstica reversa simult\u00E2nea sedex",
            "LB" to "log\u00EDstica reversa simult\u00E2nea sedex",
            "LC" to "objeto internacional prime",
            "LD" to "objeto internacional prime",
            "LE" to "log\u00EDstica reversa economica",
            "LF" to "objeto internacional prime",
            "LG" to "objeto internacional prime",
            "LH" to "objeto internacional prime",
            "LI" to "objeto internacional prime",
            "LJ" to "objeto internacional prime",
            "LK" to "objeto internacional prime",
            "LL" to "objeto internacional prime",
            "LM" to "objeto internacional prime",
            "LN" to "objeto internacional prime",
            "LP" to "log\u00EDstica reversa simult\u00E2nea pac",
            "LQ" to "objeto internacional prime",
            "LS" to "logistica reversa sedex",
            "LV" to "logistica reversa expressa",
            "LW" to "objeto internacional prime",
            "LX" to "objeto internacional packet economic",
            "LY" to "objeto internacional prime",
            "LZ" to "objeto internacional prime",
            "MA" to "telegrama - servicos adicionais",
            "MB" to "telegrama de balcao",
            "MC" to "telegrama fonado",
            "MD" to "maquina de franquear (logica)",
            "ME" to "telegrama",
            "MF" to "telegrama fonado",
            "MH" to "carta via internet",
            "MK" to "telegrama corporativo",
            "MM" to "telegrama grandes clientes",
            "MP" to "telegrama pr\u00E9-pago",
            "MS" to "encomenda saude",
            "MT" to "telegrama via telemail",
            "MY" to "telegrama internacional entrante",
            "MZ" to "telegrama via correios on line",
            "NE" to "tele sena resgatada",
            "NX" to "edei encomenda nao urgente",
            "OA" to "encomenda sedex (etiq logica)",
            "OB" to "encomenda sedex (etiq logica)",
            "OC" to "encomenda sedex (etiq logica)",
            "OD" to "encomenda sedex (etiq f\u00EDsica)",
            "OF" to "etiqueta l\u00F3gica sedex",
            "OG" to "etiqueta l\u00F3gica sedex",
            "OH" to "etiqueta l\u00F3gica sedex",
            "PA" to "passaporte",
            "PB" to "encomenda pac - n\u00E3o urgente",
            "PC" to "encomenda pac a cobrar",
            "PD" to "encomenda pac",
            "PE" to "encomenda pac (etiqueta fisica)",
            "PF" to "passaporte",
            "PG" to "encomenda pac (etiqueta fisica)",
            "PH" to "encomenda pac (etiqueta logica)",
            "PI" to "encomenda pac",
            "PJ" to "encomenda pac",
            "PK" to "pac extra grande",
            "PL" to "encomenda pac",
            "PM" to "encomenda pac (etiq f\u00EDsica)",
            "PN" to "encomenda pac (etiq logica)",
            "PO" to "encomenda pac (etiq logica)",
            "PP" to "etiqueta l\u00F3gica pac",
            "PQ" to "etiqueta logica pac mini",
            "PR" to "reembolso postal - cliente avulso",
            "PS" to "etiqueta l\u00F3gica pac",
            "PT" to "etiqueta l\u00F3gica pac",
            "PZ" to "etiqueta l\u00F3gica pac",
            "PU" to "etiqueta l\u00F3gica pac",
            "PV" to "etiqueta l\u00F3gica pac administrativo",
            "PX" to "etiqueta l\u00F3gica pac",
            "QE" to "pac rastreável",
            "RA" to "registrado priorit\u00E1rio",
            "RB" to "carta registrada",
            "RC" to "carta registrada com valor declarado",
            "RD" to "remessa economica detran",
            "RE" to "mala direta postal especial",
            "RF" to "objeto da receita federal",
            "RG" to "registrado do sistema sara",
            "RH" to "registrado com ar digital",
            "RI" to "registrado priorit\u00E1rio internacional",
            "RJ" to "registrado ag\u00EAncia",
            "RK" to "registrado ag\u00EAncia",
            "RL" to "registrado l\u00F3gico",
            "RM" to "registrado ag\u00EAncia",
            "RN" to "registrado ag\u00EAncia",
            "RO" to "registrado ag\u00EAncia",
            "RP" to "reembolso postal - cliente inscrito",
            "RQ" to "registrado ag\u00EAncia",
            "RR" to "registrado internacional",
            "RS" to "rem econ org transito com ou sem ar",
            "RT" to "rem econ talao/cartao sem ar digita",
            "RU" to "registrado servi\u00E7o ect",
            "RV" to "rem econ crlv/crv/cnh com ar digital",
            "RW" to "registrado internacional",
            "RX" to "registrado internacional",
            "RY" to "rem econ talao/cartao com ar digital",
            "RZ" to "registrado",
            "SA" to "etiqueta sedex ag\u00EAncia",
            "SB" to "sedex 10",
            "SC" to "sedex a cobrar",
            "SD" to "remessa expressa detran",
            "SE" to "encomenda sedex",
            "SF" to "sedex agencia",
            "SG" to "sedex do sistema sara",
            "SH" to "sedex com ar digital",
            "SI" to "sedex ag\u00EAncia",
            "SJ" to "sedex hoje",
            "SK" to "sedex ag\u00EAncia",
            "SL" to "sedex l\u00F3gico",
            "SM" to "sedex 12",
            "SN" to "sedex ag\u00EAncia",
            "SO" to "sedex ag\u00EAncia",
            "SP" to "sedex pr\u00E9-franqueado",
            "SQ" to "sedex",
            "SR" to "sedex",
            "SS" to "sedex f\u00EDsico",
            "ST" to "rem expres talao/cartao sem ar digital",
            "SU" to "encomenda servi\u00E7o expressa ect",
            "SV" to "rem expres crlv/crv/cnh com ar digital",
            "SW" to "encomenda sedex",
            "SX" to "sedex 10",
            "SY" to "rem expres talao/cartao com ar digital",
            "SZ" to "sedex ag\u00EAncia",
            "TC" to "teste (objeto para treinamento)",
            "TE" to "teste (objeto para treinamento)",
            "TR" to "objeto treinamento - n\u00E3o gera pr\u00E9-alerta",
            "TS" to "teste (objeto para treinamento)",
            "VA" to "objeto internacional com valor declarado",
            "VC" to "objeto internacional com valor declarado",
            "VD" to "objeto internacional com valor declarado",
            "VE" to "objeto internacional com valor declarado",
            "VF" to "objeto internacional com valor declarado",
            "VV" to "objeto internacional com valor declarado",
            "XA" to "aviso chegada objeto int tributado",
            "XM" to "sedex mundi",
            "XR" to "objeto internacional (pps tributado)",
            "XX" to "objeto internacional (pps tributado)"
        )
    }
}
