from openai import OpenAI

client = OpenAI(api_key='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')

completion = client.chat.completions.create(
    model="gpt-3.5-turbo",
    messages=[
        {"role": "user", "content": "Hello!"}
    ]
)

print(completion.choices[0].message)
