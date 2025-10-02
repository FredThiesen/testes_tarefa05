# Projeto Python — Coverage Demo

Exemplo para demonstrar cobertura de linhas e branches com coverage.py / pytest-cov.

## Instalação
python -m venv .venv
source .venv/bin/activate
pip install -r requirements.txt

## Executar testes com cobertura

pytest --cov=python_project --cov-report=term-missing --cov-report=html
# Abra htmlcov/index.html


## Gerar XML para SonarQube

pytest --cov=python_project --cov-report=xml

