import pandas as pd
import matplotlib.pyplot as plt

df = pd.read_csv('resultadoB.csv', usecols=['TIPO', 'TAMANHO_ENTRADA', 'SEGUNDOS'])

df = df.reset_index()
df = df.pivot(index='TAMANHO_ENTRADA', columns='TIPO', values='SEGUNDOS')

df.plot()

plt.show()