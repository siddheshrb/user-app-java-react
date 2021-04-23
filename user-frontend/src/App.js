import React from 'react';
//import './App.css';

class App extends React.Component {
  render() {
  return (
    <div className="container">
      <div className="row">
        <div className="col s6">
          <form>
            <div className="input-field col s12">
              <i class="material-icons prefix">person</i>
              <input type="text" id="autocomplete-input" class="autocomplete"/>
              <label for="autocomplete-input">Autocomplete</label>
            </div>
            <div className="input-field col s12">
              <i class="material-icons prefix">email</i>
              <input type="email" id="autocomplete-input" class="autocomplete"/>
              <label for="autocomplete-input">Email</label>
            </div>
            <div className="input-field col s12">
              <i class="material-icons prefix">vpn_key</i>
              <input type="password" id="autocomplete-input" class="autocomplete"/>
              <label for="autocomplete-input">Password</label>
            </div>
            <button class="btn waves-effect waves-light right" type="submit" name="action">Submit
              <i class="material-icons right">send</i>
            </button>
          </form>
        </div>
        <div className="col s6">
          <table>
            <thread>
              <tr>
                <th>Name</th>
                <th>Email</th>
                <th>Password</th>
                <th>Edit</th>
                <th>Delete</th>
              </tr>
            <tbody>
              <tr>
                <td>Dummy</td>
                <td>abc</td>
                <td>pass</td>
                <td>dummy</td>
                <td>dummy</td>
              </tr>
            </tbody>
            </thread>
          </table>
        </div>
      </div>
    </div>
  );
  }
}

export default App;
