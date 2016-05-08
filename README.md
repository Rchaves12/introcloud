# Introclound


# Endpoints

## Get all todos

### Request:

**URL:**

```
GET: localhost:8080/todos
```

**Response**

```
[
	{
		content: "content",
		i: 1
	},
	{
		content: "content2",
		i: 2
	}
]
```

## Create a todo

### Request:

**URL:**

```
POST: /todo
```

**Body:**

```
{
	title: "title"
}
```

**Response:**

```
{
	title: "title",
	id: 1
}
```
